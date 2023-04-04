package com.nimai.admin.payload;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ReportPaymentAndSubscription {
  private String user_ID;
  
  private String user_Type;
  
  private String organization;
  
  private String mobile;
  
  private String landline;
  
  private String country;
  
  private String email;
  
  private String first_Name;
  
  private String last_Name;
  
  private String plan;
  
  private String invoice_number;
  
  private double subscription_amount;
  
  private String subscription_status;
  
//  private String vas;
  
  private String vas_status;
  
  private double vas_pricing;
  
  private String coupon_Code;
  
  private double coupon_Discount;
  

  
  private double net_fee_IN_USD;
  
//  private String ccy;
  
  private String mode_of_Payment;
  
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date date_3_Time;
  
  private String payment_ID;
  private String payment_Status;
  private Date plan_activation_Date;
  private Date plan_expiry_Date;
  private String maker_Comment;
  private String checker_Comment;

  public String getPayment_Status() {
    return payment_Status;
  }

  public void setPayment_Status(String payment_Status) {
    this.payment_Status = payment_Status;
  }

  public double getNet_fee_IN_USD() {
	return net_fee_IN_USD;
}

public void setNet_fee_IN_USD(double net_fee_IN_USD) {
	this.net_fee_IN_USD = net_fee_IN_USD;
}

public String getMaker_Comment() {
	return maker_Comment;
}

public void setMaker_Comment(String maker_Comment) {
	this.maker_Comment = maker_Comment;
}

public String getChecker_Comment() {
	return checker_Comment;
}

public void setChecker_Comment(String checker_Comment) {
	this.checker_Comment = checker_Comment;
}


  public String getInvoice_number() {
    return this.invoice_number;
  }
  
  public void setInvoice_number(String invoice_number) {
    this.invoice_number = invoice_number;
  }
  
  public String getSubscription_status() {
    return this.subscription_status;
  }
  
  public void setSubscription_status(String subscription_status) {
    this.subscription_status = subscription_status;
  }
  
  public double getVas_pricing() {
    return this.vas_pricing;
  }
  
  public void setVas_pricing(double vas_pricing) {
    this.vas_pricing = vas_pricing;
  }
  
  public double getSubscription_amount() {
    return this.subscription_amount;
  }
  
  public void setSubscription_amount(double subscription_amount) {
    this.subscription_amount = subscription_amount;
  }
  
  public String getVas_status() {
    return this.vas_status;
  }
  
  public void setVas_status(String vas_status) {
    this.vas_status = vas_status;
  }
  
  public String getUser_ID() {
    return this.user_ID;
  }
  
  public void setUser_ID(String user_ID) {
    this.user_ID = user_ID;
  }
  
  public String getUser_Type() {
    return this.user_Type;
  }
  
  public void setUser_Type(String user_Type) {
    this.user_Type = user_Type;
  }
  
  public String getOrganization() {
    return this.organization;
  }
  
  public void setOrganization(String organization) {
    this.organization = organization;
  }
  
  public String getMobile() {
    return this.mobile;
  }
  
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  public String getLandline() {
    return this.landline;
  }
  
  public void setLandline(String landline) {
    this.landline = landline;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getFirst_Name() {
    return this.first_Name;
  }
  
  public void setFirst_Name(String first_Name) {
    this.first_Name = first_Name;
  }
  
  public String getLast_Name() {
    return this.last_Name;
  }
  
  public void setLast_Name(String last_Name) {
    this.last_Name = last_Name;
  }
  
  public String getPlan() {
    return this.plan;
  }
  
  public void setPlan(String plan) {
    this.plan = plan;
  }
  
//  public String getVas() {
//    return this.vas;
//  }
//  
//  public void setVas(String vas) {
//    this.vas = vas;
//  }
//  
  public String getCoupon_Code() {
    return this.coupon_Code;
  }
  
  public void setCoupon_Code(String coupon_Code) {
    this.coupon_Code = coupon_Code;
  }
  
  public double getCoupon_Discount() {
    return this.coupon_Discount;
  }
  
  public void setCoupon_Discount(double coupon_Discount) {
    this.coupon_Discount = coupon_Discount;
  }
  


  

  
  public String getMode_of_Payment() {
    return this.mode_of_Payment;
  }
  
  public void setMode_of_Payment(String mode_of_Payment) {
    this.mode_of_Payment = mode_of_Payment;
  }
  
  public Date getDate_3_Time() {
    return this.date_3_Time;
  }
  
  public void setDate_3_Time(Date date_3_Time) {
    this.date_3_Time = date_3_Time;
  }
  
  public String getPayment_ID() {
    return this.payment_ID;
  }
  
  public void setPayment_ID(String payment_ID) {
    this.payment_ID = payment_ID;
  }
  
  public Date getPlan_activation_Date() {
    return this.plan_activation_Date;
  }
  
  public void setPlan_activation_Date(Date plan_activation_Date) {
    this.plan_activation_Date = plan_activation_Date;
  }
  
  public Date getPlan_expiry_Date() {
    return this.plan_expiry_Date;
  }
  
  public void setPlan_expiry_Date(Date plan_expiry_Date) {
    this.plan_expiry_Date = plan_expiry_Date;
  }
}
