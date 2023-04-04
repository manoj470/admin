package com.nimai.admin.payload;

import java.util.Date;
import java.util.List;

public class PlanOfPaymentDetailsResponse {
  private Integer splSerialNumber;
  
  private String userid;
  
  private String subscriptionId;
  
  private String subscriptionName;
  
  private String subscriptionAmount;
  
  private String lcCount;
  
  private Date splanStartDate;
  
  private Date splanEndDate;
  
  private String subsidiaries;
  
  private String relationshipManager;
  
  private String customerSupport;
  
  private String remark;
  
  private String status;
  
  private String subscriptionValidity;
  
  private String vasPlan;
  
  private String vasStatus;
  
  private String vasBenefits;
  
  private String couponCode;
  
  private String isMultipleVasApplied;
  
  private String discount;
  
  private String amountPaid;
  
  private String paymentStatus;
  
  private Date insertedDate;
  
  private String paymentMode;
  
  private String transactionId;
  
  private String vasAmount;
  
  private String totalAmount;
  
  private String makerComment;
  
  private String checkerComment;
  
  private String vasPlanPaymentMode;
  
  private String vasPaymentStatus;
  
  private Integer vasId;
  
  private String vasMakerComment;
  
  private String vasCheckerComment;
  
  private int isVasAppliedWithSPlan;
  
  private int isSplanWithVasFlag;
  
  private List<VasDetails> vasList;
  private List<NimaiPostpaidSubscriptionRes> postPaidList;
  
  private String dueTtpe;
  
  
  
  public String getDueTtpe() {
	return dueTtpe;
}

public void setDueTtpe(String dueTtpe) {
	this.dueTtpe = dueTtpe;
}

public List<NimaiPostpaidSubscriptionRes> getPostPaidList() {
	return postPaidList;
}

public void setPostPaidList(List<NimaiPostpaidSubscriptionRes> postPaidList) {
	this.postPaidList = postPaidList;
}

public String getIsMultipleVasApplied() {
    return this.isMultipleVasApplied;
  }
  
  public void setIsMultipleVasApplied(String isMultipleVasApplied) {
    this.isMultipleVasApplied = isMultipleVasApplied;
  }
  
  public List<VasDetails> getVasList() {
    return this.vasList;
  }
  
  public void setVasList(List<VasDetails> vasList) {
    this.vasList = vasList;
  }
  
  public int getIsSplanWithVasFlag() {
    return this.isSplanWithVasFlag;
  }
  
  public void setIsSplanWithVasFlag(int isSplanWithVasFlag) {
    this.isSplanWithVasFlag = isSplanWithVasFlag;
  }
  
  public int getIsVasAppliedWithSPlan() {
    return this.isVasAppliedWithSPlan;
  }
  
  public void setIsVasAppliedWithSPlan(int isVasAppliedWithSPlan) {
    this.isVasAppliedWithSPlan = isVasAppliedWithSPlan;
  }
  
  public String getVasMakerComment() {
    return this.vasMakerComment;
  }
  
  public void setVasMakerComment(String vasMakerComment) {
    this.vasMakerComment = vasMakerComment;
  }
  
  public String getVasCheckerComment() {
    return this.vasCheckerComment;
  }
  
  public void setVasCheckerComment(String vasCheckerComment) {
    this.vasCheckerComment = vasCheckerComment;
  }
  
  public String getVasPlanPaymentMode() {
    return this.vasPlanPaymentMode;
  }
  
  public void setVasPlanPaymentMode(String vasPlanPaymentMode) {
    this.vasPlanPaymentMode = vasPlanPaymentMode;
  }
  
  public String getVasPaymentStatus() {
    return this.vasPaymentStatus;
  }
  
  public void setVasPaymentStatus(String vasPaymentStatus) {
    this.vasPaymentStatus = vasPaymentStatus;
  }
  
  public Integer getVasId() {
    return this.vasId;
  }
  
  public void setVasId(Integer vasId) {
    this.vasId = vasId;
  }
  
  public String getMakerComment() {
    return this.makerComment;
  }
  
  public void setMakerComment(String makerComment) {
    this.makerComment = makerComment;
  }
  
  public String getCheckerComment() {
    return this.checkerComment;
  }
  
  public void setCheckerComment(String checkerComment) {
    this.checkerComment = checkerComment;
  }
  
  public String getTotalAmount() {
    return this.totalAmount;
  }
  
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }
  
  public Integer getSplSerialNumber() {
    return this.splSerialNumber;
  }
  
  public void setSplSerialNumber(Integer splSerialNumber) {
    this.splSerialNumber = splSerialNumber;
  }
  
  public String getUserid() {
    return this.userid;
  }
  
  public void setUserid(String userid) {
    this.userid = userid;
  }
  
  public String getSubscriptionId() {
    return this.subscriptionId;
  }
  
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
  
  public String getSubscriptionName() {
    return this.subscriptionName;
  }
  
  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }
  
  public String getSubscriptionAmount() {
    return this.subscriptionAmount;
  }
  
  public void setSubscriptionAmount(String subscriptionAmount) {
    this.subscriptionAmount = subscriptionAmount;
  }
  
  public String getLcCount() {
    return this.lcCount;
  }
  
  public void setLcCount(String lcCount) {
    this.lcCount = lcCount;
  }
  
  public Date getSplanStartDate() {
    return this.splanStartDate;
  }
  
  public void setSplanStartDate(Date splanStartDate) {
    this.splanStartDate = splanStartDate;
  }
  
  public Date getSplanEndDate() {
    return this.splanEndDate;
  }
  
  public void setSplanEndDate(Date splanEndDate) {
    this.splanEndDate = splanEndDate;
  }
  
  public String getSubsidiaries() {
    return this.subsidiaries;
  }
  
  public void setSubsidiaries(String subsidiaries) {
    this.subsidiaries = subsidiaries;
  }
  
  public String getRelationshipManager() {
    return this.relationshipManager;
  }
  
  public void setRelationshipManager(String relationshipManager) {
    this.relationshipManager = relationshipManager;
  }
  
  public String getCustomerSupport() {
    return this.customerSupport;
  }
  
  public void setCustomerSupport(String customerSupport) {
    this.customerSupport = customerSupport;
  }
  
  public String getRemark() {
    return this.remark;
  }
  
  public void setRemark(String remark) {
    this.remark = remark;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public String getSubscriptionValidity() {
    return this.subscriptionValidity;
  }
  
  public void setSubscriptionValidity(String subscriptionValidity) {
    this.subscriptionValidity = subscriptionValidity;
  }
  
  public String getVasPlan() {
    return this.vasPlan;
  }
  
  public void setVasPlan(String vasPlan) {
    this.vasPlan = vasPlan;
  }
  
  public String getVasStatus() {
    return this.vasStatus;
  }
  
  public void setVasStatus(String vasStatus) {
    this.vasStatus = vasStatus;
  }
  
  public String getVasBenefits() {
    return this.vasBenefits;
  }
  
  public void setVasBenefits(String vasBenefits) {
    this.vasBenefits = vasBenefits;
  }
  
  public PlanOfPaymentDetailsResponse() {}
  
  public String getDiscount() {
    return this.discount;
  }
  
  public void setDiscount(String discount) {
    this.discount = discount;
  }
  
  public String getAmountPaid() {
    return this.amountPaid;
  }
  
  public void setAmountPaid(String amountPaid) {
    this.amountPaid = amountPaid;
  }
  
  public String getPaymentStatus() {
    return this.paymentStatus;
  }
  
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
  
  public Date getInsertedDate() {
    return this.insertedDate;
  }
  
  public void setInsertedDate(Date insertedDate) {
    this.insertedDate = insertedDate;
  }
  
  public String getPaymentMode() {
    return this.paymentMode;
  }
  
  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }
  
  public String getCouponCode() {
    return this.couponCode;
  }
  
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }
  
  public String getTransactionId() {
    return this.transactionId;
  }
  
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  
  public String getVasAmount() {
    return this.vasAmount;
  }
  
  public void setVasAmount(String vasAmount) {
    this.vasAmount = vasAmount;
  }
  
  public PlanOfPaymentDetailsResponse(Integer splSerialNumber, String userid, String subscriptionId, String subscriptionName, String subscriptionAmount, String lcCount, Date splanStartDate, Date splanEndDate, String subsidiaries, String relationshipManager, String customerSupport, String remark, String status, String subscriptionValidity, String vasPlan, String vasStatus, String vasBenefits, String discount, String amountPaid, String paymentStatus, Date insertedDate, String paymentMode) {
    this.splSerialNumber = splSerialNumber;
    this.userid = userid;
    this.subscriptionId = subscriptionId;
    this.subscriptionName = subscriptionName;
    this.subscriptionAmount = subscriptionAmount;
    this.lcCount = lcCount;
    this.splanStartDate = splanStartDate;
    this.splanEndDate = splanEndDate;
    this.subsidiaries = subsidiaries;
    this.relationshipManager = relationshipManager;
    this.customerSupport = customerSupport;
    this.remark = remark;
    this.status = status;
    this.subscriptionValidity = subscriptionValidity;
    this.vasPlan = vasPlan;
    this.vasStatus = vasStatus;
    this.vasBenefits = vasBenefits;
    this.discount = discount;
    this.amountPaid = amountPaid;
    this.paymentStatus = paymentStatus;
    this.insertedDate = insertedDate;
    this.paymentMode = paymentMode;
  }
}
