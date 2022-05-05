package com.diversity.model;

import com.diversity.entity.Diversity;

public class LeaderDiversityInfoDto {

    private Integer id;
    private String name;
    private String companyName;
    private String mobileNumber;
    private String emailId;
    private Diversity diversity;
    public LeaderDiversityInfoDto(){}

    public LeaderDiversityInfoDto(String name, String companyName, String mobileNumber, String emailId, Diversity diversity) {
        this.name = name;
        this.companyName = companyName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.diversity = diversity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Diversity getDiversity() {
        return diversity;
    }

    public void setDiversity(Diversity diversity) {
        this.diversity = diversity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LeaderDiversityInfoDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", diversity=" + diversity +
                '}';
    }
}
