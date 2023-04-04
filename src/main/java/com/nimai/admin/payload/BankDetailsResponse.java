package com.nimai.admin.payload;

import java.util.List;

public class BankDetailsResponse {
  private String subscriberType;
  
  private String userid;
  
  private String firstName;
  
  private String lastName;
  
  private String emailAddress;
  
  private String additionalEmail1;
  
  private String additionalEmail2;
  
  private String additionalEmail3;
  
  
  private String mobileNumber;
  
  private String vasNUmber;
  
  private String countryName;
  
  private String landline;
  
  private String address1;
  
  private String address2;
  
  private String address3;
  
  private String city;
  
  private String pincode;
  
  private String companyName;
  
  private String bankName;
  
  private String branchName;
  
  private String swiftCode;
  
  private String designation;
  
  private String relationshipManager;
  
  private String minValueofLc;
  
  private String currencyCode;
  
  private String businessType;
  
  private String registeredCountry;
  
  private String telephone;
  
  private String ownerName;
  
  private String registrationType;
  
  private String provincename;
  
  private int planId;
  
  private String planOfPayments;
  
  private long totalQuotes;
  
  private String kyc;
  
  private String makerComment;
  
  private String checkerComment;
  
  private String paymentApprovedBy;
  
  private String rmFirstName;
  
  private String rmLastName;
  
  private String rmDesignation;
  
  private String mdFirstName;
  
  private String mdLastName;
  
  private String referredFirstName;
  
  private String referredLastName;
  
  private String referredCompanyName;
  
  private String referredUserId;
  
  private String buisnessCountry;
  
  private String status;
  
  private String intCountries;
  
  private String beneIntCountries;
  
  private String blkGoods;
  
  private String vasStatus;
  
  private String vasMakerComment;
  
  private String vasCheckerComment;
  
  private String paymentMode;
  
  private int isAssociated;
  
  private String parentUserId;
  
  private List<AssociatedAccountsDetails> subsidiary;
  
  private List<OwenerBean> owner;
  
  private String mrpa;
  
  private String createdBy;
  
  private String offBaauStatus;
  
  private List<AdditionalUserList> additionalEmailList;
  
  private String rmDetails;
  
  private String  postPaidIdString;
  
  private int 	postPaidId;
  
  private String dueType;
  
  
  
 
  
  public String getDueType() {
	return dueType;
}

public void setDueType(String dueType) {
	this.dueType = dueType;
}

public int getPostPaidId() {
	return postPaidId;
}

public void setPostPaidId(int postPaidId) {
	this.postPaidId = postPaidId;
}

public String getPostPaidIdString() {
	return postPaidIdString;
}

public void setPostPaidIdString(String postPaidIdString) {
	this.postPaidIdString = postPaidIdString;
}

public String getRmDetails() {
	return rmDetails;
}

public void setRmDetails(String rmDetails) {
	this.rmDetails = rmDetails;
}

public List<AdditionalUserList> getAdditionalEmailList() {
	return additionalEmailList;
}

public void setAdditionalEmailList(List<AdditionalUserList> additionalEmailList) {
	this.additionalEmailList = additionalEmailList;
}

public String getOffBaauStatus() {
	return offBaauStatus;
}

public void setOffBaauStatus(String offBaauStatus) {
	this.offBaauStatus = offBaauStatus;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

public String getMrpa() {
	return mrpa;
}

public void setMrpa(String mrpa) {
	this.mrpa = mrpa;
}

public int getIsAssociated() {
    return this.isAssociated;
  }
  
  public void setIsAssociated(int isAssociated) {
    this.isAssociated = isAssociated;
  }
  
  public String getParentUserId() {
    return this.parentUserId;
  }
  
  public void setParentUserId(String parentUserId) {
    this.parentUserId = parentUserId;
  }
  
  public String getBeneIntCountries() {
    return this.beneIntCountries;
  }
  
  public void setBeneIntCountries(String beneIntCountries) {
    this.beneIntCountries = beneIntCountries;
  }
  
  public String getVasNUmber() {
    return this.vasNUmber;
  }
  
  public void setVasNUmber(String vasNUmber) {
    this.vasNUmber = vasNUmber;
  }
  
  public String getPaymentMode() {
    return this.paymentMode;
  }
  
  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
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
  
  public String getVasStatus() {
    return this.vasStatus;
  }
  
  public void setVasStatus(String vasStatus) {
    this.vasStatus = vasStatus;
  }
  
  public String getCurrencyCode() {
    return this.currencyCode;
  }
  
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }
  
  public String getBlkGoods() {
    return this.blkGoods;
  }
  
  public void setBlkGoods(String blkGoods) {
    this.blkGoods = blkGoods;
  }
  
  public String getIntCountries() {
    return this.intCountries;
  }
  
  public void setIntCountries(String intCountries) {
    this.intCountries = intCountries;
  }
  
  public BankDetailsResponse() {}
  
  public BankDetailsResponse(String subscriberType, String userid, String firstName, String lastName, String emailAddress, String mobileNumber, String countryName, String landline, String designation, String companyName, String businessType, String bankName, String branchName, String swiftCode, String registeredCountry, String telephone, String minValueofLc, String ownerName, String registrationType, String provincename, String address1, String address2, String address3, String city, String pincode, String relationshipManager, int isAssociated, String parentUserId) {
    this.subscriberType = subscriberType;
    this.isAssociated = isAssociated;
    this.parentUserId = parentUserId;
    this.userid = userid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.mobileNumber = mobileNumber;
    this.countryName = countryName;
    this.landline = landline;
    this.designation = designation;
    this.companyName = companyName;
    this.businessType = businessType;
    this.bankName = bankName;
    this.branchName = branchName;
    this.swiftCode = swiftCode;
    this.registeredCountry = registeredCountry;
    this.telephone = telephone;
    this.minValueofLc = minValueofLc;
    this.ownerName = ownerName;
    this.registrationType = registrationType;
    this.provincename = provincename;
    this.address1 = address1;
    this.address2 = address2;
    this.address3 = address3;
    this.city = city;
    this.pincode = pincode;
    this.relationshipManager = relationshipManager;
  }
  
  public String getSubscriberType() {
    return this.subscriberType;
  }
  
  public void setSubscriberType(String subscriberType) {
    this.subscriberType = subscriberType;
  }
  
  public String getUserid() {
    return this.userid;
  }
  
  public void setUserid(String userid) {
    this.userid = userid;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmailAddress() {
    return this.emailAddress;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public String getAdditionalEmail1() {
    return this.additionalEmail1;
  }
  
  public void setAdditionalEmail1(String additionalEmail1) {
    this.additionalEmail1 = additionalEmail1;
  }
  
  public String getAdditionalEmail2() {
    return this.additionalEmail2;
  }
  
  public void setAdditionalEmail2(String additionalEmail2) {
    this.additionalEmail2 = additionalEmail2;
  }
  
  public String getAdditionalEmail3() {
    return this.additionalEmail3;
  }
  
  public void setAdditionalEmail3(String additionalEmail3) {
    this.additionalEmail3 = additionalEmail3;
  }
  
  public String getMobileNumber() {
    return this.mobileNumber;
  }
  
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }
  
  public String getCountryName() {
    return this.countryName;
  }
  
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }
  
  public String getLandline() {
    return this.landline;
  }
  
  public void setLandline(String landline) {
    this.landline = landline;
  }
  
  public String getDesignation() {
    return this.designation;
  }
  
  public void setDesignation(String designation) {
    this.designation = designation;
  }
  
  public String getCompanyName() {
    return this.companyName;
  }
  
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
  
  public String getBusinessType() {
    return this.businessType;
  }
  
  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }
  
  public String getBankName() {
    return this.bankName;
  }
  
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  
  public String getBranchName() {
    return this.branchName;
  }
  
  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }
  
  public String getSwiftCode() {
    return this.swiftCode;
  }
  
  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }
  
  public String getRegisteredCountry() {
    return this.registeredCountry;
  }
  
  public void setRegisteredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
  }
  
  public String getTelephone() {
    return this.telephone;
  }
  
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  public String getMinValueofLc() {
    return this.minValueofLc;
  }
  
  public void setMinValueofLc(String minValueofLc) {
    this.minValueofLc = minValueofLc;
  }
  
  public String getOwnerName() {
    return this.ownerName;
  }
  
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  
  public String getRegistrationType() {
    return this.registrationType;
  }
  
  public void setRegistrationType(String registrationType) {
    this.registrationType = registrationType;
  }
  
  public String getProvincename() {
    return this.provincename;
  }
  
  public void setProvincename(String provincename) {
    this.provincename = provincename;
  }
  
  public String getAddress1() {
    return this.address1;
  }
  
  public void setAddress1(String address1) {
    this.address1 = address1;
  }
  
  public String getAddress2() {
    return this.address2;
  }
  
  public void setAddress2(String address2) {
    this.address2 = address2;
  }
  
  public String getAddress3() {
    return this.address3;
  }
  
  public void setAddress3(String address3) {
    this.address3 = address3;
  }
  
  public String getCity() {
    return this.city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getPincode() {
    return this.pincode;
  }
  
  public void setPincode(String pincode) {
    this.pincode = pincode;
  }
  
  public String getRelationshipManager() {
    return this.relationshipManager;
  }
  
  public void setRelationshipManager(String relationshipManager) {
    this.relationshipManager = relationshipManager;
  }
  
  public String getPlanOfPayments() {
    return this.planOfPayments;
  }
  
  public void setPlanOfPayments(String planOfPayments) {
    this.planOfPayments = planOfPayments;
  }
  
  public long getTotalQuotes() {
    return this.totalQuotes;
  }
  
  public void setTotalQuotes(long totalQuotes) {
    this.totalQuotes = totalQuotes;
  }
  
  public String getKyc() {
    return this.kyc;
  }
  
  public void setKyc(String kyc) {
    this.kyc = kyc;
  }
  
  public int getPlanId() {
    return this.planId;
  }
  
  public void setPlanId(int planId) {
    this.planId = planId;
  }
  
  public String getRmFirstName() {
    return this.rmFirstName;
  }
  
  public void setRmFirstName(String rmFirstName) {
    this.rmFirstName = rmFirstName;
  }
  
  public String getRmLastName() {
    return this.rmLastName;
  }
  
  public void setRmLastName(String rmLastName) {
    this.rmLastName = rmLastName;
  }
  
  public String getRmDesignation() {
    return this.rmDesignation;
  }
  
  public void setRmDesignation(String rmDesignation) {
    this.rmDesignation = rmDesignation;
  }
  
  public String getMdFirstName() {
    return this.mdFirstName;
  }
  
  public void setMdFirstName(String mdFirstName) {
    this.mdFirstName = mdFirstName;
  }
  
  public String getMdLastName() {
    return this.mdLastName;
  }
  
  public void setMdLastName(String mdLastName) {
    this.mdLastName = mdLastName;
  }
  
  public String getReferredFirstName() {
    return this.referredFirstName;
  }
  
  public void setReferredFirstName(String referredFirstName) {
    this.referredFirstName = referredFirstName;
  }
  
  public String getReferredLastName() {
    return this.referredLastName;
  }
  
  public void setReferredLastName(String referredLastName) {
    this.referredLastName = referredLastName;
  }
  
  public String getReferredCompanyName() {
    return this.referredCompanyName;
  }
  
  public void setReferredCompanyName(String referredCompanyName) {
    this.referredCompanyName = referredCompanyName;
  }
  
  public String getReferredUserId() {
    return this.referredUserId;
  }
  
  public void setReferredUserId(String referredUserId) {
    this.referredUserId = referredUserId;
  }
  
  public String getBuisnessCountry() {
    return this.buisnessCountry;
  }
  
  public void setBuisnessCountry(String buisnessCountry) {
    this.buisnessCountry = buisnessCountry;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public List<AssociatedAccountsDetails> getSubsidiary() {
    return this.subsidiary;
  }
  
  public void setSubsidiary(List<AssociatedAccountsDetails> subsidiary) {
    this.subsidiary = subsidiary;
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
  
  public String getPaymentApprovedBy() {
    return this.paymentApprovedBy;
  }
  
  public void setPaymentApprovedBy(String paymentApprovedBy) {
    this.paymentApprovedBy = paymentApprovedBy;
  }
  
  public List<OwenerBean> getOwner() {
    return this.owner;
  }
  
  public void setOwner(List<OwenerBean> owner) {
    this.owner = owner;
  }
}
