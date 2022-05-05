package com.diversity.model;


import com.diversity.entity.LeaderDiversityInfo;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

public class CompanyDiversityInfoDto
{
    private Long id;
    private String companyName;
    private Set<LeaderDiversityInfo> leaders;
    private String mobileNumber;
    private String emailId;

    public CompanyDiversityInfoDto() {
    }

    public CompanyDiversityInfoDto(String companyName, Set<LeaderDiversityInfo> leaders, String mobileNumber, String emailId) {
        this.companyName = companyName;
        this.leaders = leaders;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<LeaderDiversityInfo> getLeaders() {
        return leaders;
    }

    public void setLeaders(Set<LeaderDiversityInfo> leaders) {
        this.leaders = leaders;
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

    @Override
    public String toString() {
        return "CompanyDiversityInfo{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", leaders=" + leaders +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
