package com.nimai.admin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimai.admin.model.NimaiMpDiscount;
import com.nimai.admin.payload.ApiResponse;
import com.nimai.admin.payload.DiscountCouponRequest;
import com.nimai.admin.payload.DiscountCouponUpdateRequest;
import com.nimai.admin.payload.DiscountIdCouponCode;
import com.nimai.admin.payload.DiscountMpCouponRequest;
import com.nimai.admin.payload.PagedResponse;
import com.nimai.admin.payload.SearchRequest;
import com.nimai.admin.repository.CustomerRepository;
import com.nimai.admin.service.DiscountService;
import com.nimai.admin.service.SubscriptionService;
import com.nimai.admin.util.ExcelHelper;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin({"*"})
@RequestMapping({"/api/discount"})
public class DiscountController {
  @Autowired
  DiscountService discountService;
  
  @Autowired
  SubscriptionService subsService;
  
  @Autowired
  CustomerRepository custRepo;
  
  @PostMapping({"/save"})
  public ResponseEntity<?> saveCoupon(@RequestPart(required = false) MultipartFile excelFile, @RequestParam("flag") String flag, String jsonFile) {
    System.out.println("jsonString: " + jsonFile);
    DiscountCouponRequest request = null;
    try {
      request = (DiscountCouponRequest)(new ObjectMapper()).readValue(jsonFile, DiscountCouponRequest.class);
    } catch (JsonMappingException e1) {
      e1.printStackTrace();
    } catch (JsonProcessingException e1) {
      e1.printStackTrace();
    } 
    if (flag.equals("1") && excelFile != null) {
      if (ExcelHelper.hasExcelFormat(excelFile)) {
        List<DiscountIdCouponCode> dCode = this.discountService.saveDiscountCoupon(request, "PC");
        if (!dCode.isEmpty())
          try {
            List<DiscountMpCouponRequest> mpDiscouDetails = ExcelHelper.excelToMpDiscount(excelFile.getInputStream());
            List<NimaiMpDiscount> discount = this.discountService.saveMDiscount(mpDiscouDetails, dCode);
            if (discount.size() > 0)
              return new ResponseEntity(new ApiResponse(
                    Boolean.valueOf(true), discount
                    .size() + " Personalized Discount Coupons Created SuccessFully"), HttpStatus.CREATED); 
            return new ResponseEntity(new ApiResponse(
                  Boolean.valueOf(false), "Failed To Create Personalized Discount Coupons"), HttpStatus.INTERNAL_SERVER_ERROR);
          } catch (IOException e) {
            throw new RuntimeException("Fail to store excel data: " + e.getMessage());
          }  
        return new ResponseEntity(new ApiResponse(Boolean.valueOf(false), "Failed To Create Discount Coupons"), HttpStatus.INTERNAL_SERVER_ERROR);
      } 
      return new ResponseEntity(new ApiResponse(Boolean.valueOf(false), "File is not of required Excel Format"), HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    if (flag.equals("0") && excelFile == null) {
      if (this.discountService.saveDiscountCoupon(request, "NC").size() > 0)
        return new ResponseEntity(new ApiResponse(Boolean.valueOf(true), "Discount Coupons Generated SuccessFully"), HttpStatus.CREATED); 
      return new ResponseEntity(new ApiResponse(Boolean.valueOf(false), "Failed To Create Discount Coupons"), HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    return new ResponseEntity(new ApiResponse(Boolean.valueOf(false), "Wrong input!!!"), HttpStatus.INTERNAL_SERVER_ERROR);
  }
  
  @PostMapping({"/action"})
  public ResponseEntity<?> approveCoupon(@RequestBody DiscountCouponUpdateRequest request) {
    return this.discountService.updateCoupon(request);
  }
  
  @PostMapping({"/allCoupon"})
  public PagedResponse<?> getAllCoupons(@RequestBody SearchRequest request) {
    System.out.println("Page " + request.getPage());
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/activeCoupons/list"})
  public PagedResponse<?> getActiveCoupons(@RequestBody SearchRequest request) {
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/inactiveCoupons/list"})
  public PagedResponse<?> getInActiveCoupons(@RequestBody SearchRequest request) {
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/rejectedCoupons/list"})
  public PagedResponse<?> getRejectedCoupons(@RequestBody SearchRequest request) {
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/expiredCoupons/list"})
  public PagedResponse<?> getExpiredCoupons(@RequestBody SearchRequest request) {
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/pendingCoupons/list"})
  public PagedResponse<?> getPendingCoupons(@RequestBody SearchRequest request) {
    return this.discountService.getCouponDetails(request);
  }
  
  @PostMapping({"/deactivate"})
  public ResponseEntity<?> deactivateCoupon(@RequestBody DiscountCouponUpdateRequest request) {
    return this.discountService.updateCoupon(request);
  }
  
  @GetMapping({"/discountId/{id}"})
  public ResponseEntity<?> getCouponById(@PathVariable("id") Integer discountId) {
    return this.discountService.getCouponDetailsId(discountId);
  }
  
  @PostMapping({"/fetch/planName"})
  public ResponseEntity<?> getPlanName(@RequestBody SearchRequest request) {
    return this.subsService.getPlanAmount(request);
  }
  
  @PostMapping({"/download"})
  public ResponseEntity<?> getFile(@RequestParam("country") String country, @RequestParam("customerType") String customerType, @RequestParam("bankType") String bankType, @RequestParam("coupon") List<String> coupon) {
    String filename = "personalised_Coupon.xlsx";
    InputStreamResource file = new InputStreamResource(this.discountService.load(country, customerType, bankType, coupon));
    return ((ResponseEntity.BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[] { "attachment; filename=" + filename })).contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
  }
}
