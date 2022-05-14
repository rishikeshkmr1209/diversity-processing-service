package com.diversity.model;

public class CompanyDiversityResponse {

    private Long id;
    private String dunsName;
    private String dunsNumber;
    private String county;
    private String phone;
    private String city;
    private String state;
    private String zipCode;

    private String isWomenOwned;
    private String isMinorityOwned;
    private String minorityDescription;
    private String isVeteranOwned;
    private String isDisabledOwned;
    private String isLgbtOwned;

    private StatusMessage statusMessage;
    public CompanyDiversityResponse(){}

    public CompanyDiversityResponse(Long id, String dunsName, String dunsNumber, String county, String phone, String city, String state, String zipCode, String isWomenOwned, String isMinorityOwned, String minorityDescription, String isVeteranOwned, String isDisabledOwned, String isLgbtOwned, StatusMessage statusMessage) {
        this.id = id;
        this.dunsName = dunsName;
        this.dunsNumber = dunsNumber;
        this.county = county;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isWomenOwned = isWomenOwned;
        this.isMinorityOwned = isMinorityOwned;
        this.minorityDescription = minorityDescription;
        this.isVeteranOwned = isVeteranOwned;
        this.isDisabledOwned = isDisabledOwned;
        this.isLgbtOwned = isLgbtOwned;
        this.statusMessage = statusMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDunsName() {
        return dunsName;
    }

    public void setDunsName(String dunsName) {
        this.dunsName = dunsName;
    }

    public String getDunsNumber() {
        return dunsNumber;
    }

    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIsWomenOwned() {
        return isWomenOwned;
    }

    public void setIsWomenOwned(String isWomenOwned) {
        this.isWomenOwned = isWomenOwned;
    }

    public String getIsMinorityOwned() {
        return isMinorityOwned;
    }

    public void setIsMinorityOwned(String isMinorityOwned) {
        this.isMinorityOwned = isMinorityOwned;
    }

    public String getMinorityDescription() {
        return minorityDescription;
    }

    public void setMinorityDescription(String minorityDescription) {
        this.minorityDescription = minorityDescription;
    }

    public String getIsVeteranOwned() {
        return isVeteranOwned;
    }

    public void setIsVeteranOwned(String isVeteranOwned) {
        this.isVeteranOwned = isVeteranOwned;
    }

    public String getIsDisabledOwned() {
        return isDisabledOwned;
    }

    public void setIsDisabledOwned(String isDisabledOwned) {
        this.isDisabledOwned = isDisabledOwned;
    }

    public String getIsLgbtOwned() {
        return isLgbtOwned;
    }

    public void setIsLgbtOwned(String isLgbtOwned) {
        this.isLgbtOwned = isLgbtOwned;
    }

    public StatusMessage getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(StatusMessage statusMessage) {
        this.statusMessage = statusMessage;
    }
}
