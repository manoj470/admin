package com.nimai.admin.payload;

import java.util.Date;

public class VasDetails {
	private String vasPlan;
	private String vasStatus;
	private String vasBenefits;
	private String vasPlanPaymentMode;
	private String vasPaymentStatus;
	private Integer vasId;
	private String vasMakerComment;
	private String vasCheckerComment;
	private String vasAmount;
	private String totalAmount;
	private int isSplanWithVasFlag;
	private String vasPaymentSts;
	private String paymentMode;
	private String vasInvoiceId;
	private Date vasInsertedDate;
	private Date vasModifiedDate;

	public Date getVasInsertedDate() {
		return vasInsertedDate;
	}

	public void setVasInsertedDate(Date vasInsertedDate) {
		this.vasInsertedDate = vasInsertedDate;
	}

	public Date getVasModifiedDate() {
		return vasModifiedDate;
	}

	public void setVasModifiedDate(Date vasModifiedDate) {
		this.vasModifiedDate = vasModifiedDate;
	}

	public String getVasInvoiceId() {
		return vasInvoiceId;
	}

	public void setVasInvoiceId(String vasInvoiceId) {
		this.vasInvoiceId = vasInvoiceId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getVasPaymentSts() {
		return vasPaymentSts;
	}
	public void setVasPaymentSts(String vasPaymentSts) {
		this.vasPaymentSts = vasPaymentSts;
	}
	public int getIsSplanWithVasFlag() {
		return isSplanWithVasFlag;
	}
	public void setIsSplanWithVasFlag(int isSplanWithVasFlag) {
		this.isSplanWithVasFlag = isSplanWithVasFlag;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getVasPlan() {
		return vasPlan;
	}
	public void setVasPlan(String vasPlan) {
		this.vasPlan = vasPlan;
	}
	public String getVasStatus() {
		return vasStatus;
	}
	public void setVasStatus(String vasStatus) {
		this.vasStatus = vasStatus;
	}
	public String getVasBenefits() {
		return vasBenefits;
	}
	public void setVasBenefits(String vasBenefits) {
		this.vasBenefits = vasBenefits;
	}
	public String getVasPlanPaymentMode() {
		return vasPlanPaymentMode;
	}
	public void setVasPlanPaymentMode(String vasPlanPaymentMode) {
		this.vasPlanPaymentMode = vasPlanPaymentMode;
	}
	public String getVasPaymentStatus() {
		return vasPaymentStatus;
	}
	public void setVasPaymentStatus(String vasPaymentStatus) {
		this.vasPaymentStatus = vasPaymentStatus;
	}
	public Integer getVasId() {
		return vasId;
	}
	public void setVasId(Integer vasId) {
		this.vasId = vasId;
	}
	public String getVasMakerComment() {
		return vasMakerComment;
	}
	public void setVasMakerComment(String vasMakerComment) {
		this.vasMakerComment = vasMakerComment;
	}
	public String getVasCheckerComment() {
		return vasCheckerComment;
	}
	public void setVasCheckerComment(String vasCheckerComment) {
		this.vasCheckerComment = vasCheckerComment;
	}
	public String getVasAmount() {
		return vasAmount;
	}
	public void setVasAmount(String vasAmount) {
		this.vasAmount = vasAmount;
	}
	@Override
	public String toString() {
		return "VasDetails [vasPlan=" + vasPlan + ", vasStatus=" + vasStatus + ", vasBenefits=" + vasBenefits
				+ ", vasPlanPaymentMode=" + vasPlanPaymentMode + ", vasPaymentStatus=" + vasPaymentStatus + ", vasId="
				+ vasId + ", vasMakerComment=" + vasMakerComment + ", vasCheckerComment=" + vasCheckerComment
				+ ", vasAmount=" + vasAmount + ", totalAmount=" + totalAmount + ", isSplanWithVasFlag="
				+ isSplanWithVasFlag + "]";
	}
	
	
	
}
