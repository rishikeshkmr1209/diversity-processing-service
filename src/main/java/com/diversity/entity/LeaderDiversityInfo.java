package com.diversity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LeaderDiversityInfo {
    @Id
    private Integer id;
    private String name;
    private String companyName;
    private String mobileNumber;
    private String emailId;
    private Diversity diversity;

    public LeaderDiversityInfo() {
    }

    public LeaderDiversityInfo(String name, String companyName, String mobileNumber, String emailId, Diversity diversity) {
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

    @Override
    public String toString() {
        return "LeaderDiversityInfo{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", diversity=" + diversity +
                '}';
    }
}
