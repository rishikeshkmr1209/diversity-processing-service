package com.diversity.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class CompanyDiversityInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<LeaderDiversityInfo> leaders;
    private String mobileNumber;
    private String emailId;

    public CompanyDiversityInfo() {
    }

    public CompanyDiversityInfo(String companyName, Set<LeaderDiversityInfo> leaders, String mobileNumber, String emailId) {
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
