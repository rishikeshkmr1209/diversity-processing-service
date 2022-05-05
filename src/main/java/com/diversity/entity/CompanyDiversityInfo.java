package com.diversity.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class CompanyDiversityInfo {


    private Integer id;
    private String companyName;
    private List<String> leaders;
    private String mobileNumber;
    private String emailId;

    public CompanyDiversityInfo() {
    }

    public CompanyDiversityInfo(String companyName, List<String> leaders, String mobileNumber, String emailId) {
        this.companyName = companyName;
        this.leaders = leaders;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<String> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<String> leaders) {
        this.leaders = leaders;
    }

    @Override
    public String toString() {
        return "CompanyDiversityInfoDto{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", leaders=" + leaders +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

}
