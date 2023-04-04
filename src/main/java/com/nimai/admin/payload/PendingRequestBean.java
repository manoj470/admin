package com.nimai.admin.payload;


public class PendingRequestBean {
  private long paymentApproval;
  
  private long grantPayment;
  
  private long assignRm;
  
  private long grantRM;
  
  private long grantUser;
  
  private long kycApproval;
  
  private long grantKyc;
  
  private long kycPendingUser;
  
  private long subPlanExpiring30Days;
  
  private long PaymentPendingUser;
  
  public long getPaymentApproval() {
    return this.paymentApproval;
  }
  
  public void setPaymentApproval(long paymentApproval) {
    this.paymentApproval = paymentApproval;
  }
  
  public long getGrantPayment() {
    return this.grantPayment;
  }
  
  public void setGrantPayment(long grantPayment) {
    this.grantPayment = grantPayment;
  }
  
  public long getAssignRm() {
    return this.assignRm;
  }
  
  public void setAssignRm(long assignRm) {
    this.assignRm = assignRm;
  }
  
  public long getGrantRM() {
    return this.grantRM;
  }
  
  public void setGrantRM(long grantRM) {
    this.grantRM = grantRM;
  }
  
  public long getGrantUser() {
    return this.grantUser;
  }
  
  public void setGrantUser(long grantUser) {
    this.grantUser = grantUser;
  }
  
  public long getKycApproval() {
    return this.kycApproval;
  }
  
  public void setKycApproval(long kycApproval) {
    this.kycApproval = kycApproval;
  }
  
  public long getGrantKyc() {
    return this.grantKyc;
  }
  
  public void setGrantKyc(long grantKyc) {
    this.grantKyc = grantKyc;
  }
  
  public long getKycPendingUser() {
    return this.kycPendingUser;
  }
  
  public void setKycPendingUser(long kycPendingUser) {
    this.kycPendingUser = kycPendingUser;
  }
  
  public long getSubPlanExpiring30Days() {
    return this.subPlanExpiring30Days;
  }
  
  public void setSubPlanExpiring30Days(long subPlanExpiring30Days) {
    this.subPlanExpiring30Days = subPlanExpiring30Days;
  }
  
  public long getPaymentPendingUser() {
    return this.PaymentPendingUser;
  }
  
  public void setPaymentPendingUser(long paymentPendingUser) {
    this.PaymentPendingUser = paymentPendingUser;
  }
}

