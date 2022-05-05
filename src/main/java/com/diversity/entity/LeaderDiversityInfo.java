package com.diversity.entity;

import com.diversity.enums.Enums;

import javax.persistence.*;

@Entity
@Table
public class LeaderDiversityInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String companyName;
    private String mobileNumber;
    private String emailId;
    private String gender;
    private String nationality;
    private String religion;
    private String maritialStatus;
    private String sexualOrientation;
    private String politicalOrientation;
    private String color;
    private String language;
    private boolean isLgbt;
    private boolean isVeteran;
    private boolean isDisable;
    private long salary;

    @ManyToOne
    @JoinColumn(name="company_diversity_info_id")
    private CompanyDiversityInfo companyDiversityInfo;

    public LeaderDiversityInfo() {
    }

    public LeaderDiversityInfo(String name, String companyName, String mobileNumber, String emailId, String gender, String nationality, String religion, String maritialStatus, String sexualOrientation, String politicalOrientation, String color, String language, boolean isLgbt, boolean isVeteran, boolean isDisable, long salary) {
        this.name = name;
        this.companyName = companyName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.gender = gender;
        this.nationality = nationality;
        this.religion = religion;
        this.maritialStatus = maritialStatus;
        this.sexualOrientation = sexualOrientation;
        this.politicalOrientation = politicalOrientation;
        this.color = color;
        this.language = language;
        this.isLgbt = isLgbt;
        this.isVeteran = isVeteran;
        this.isDisable = isDisable;
        this.salary = salary;
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


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public String getPoliticalOrientation() {
        return politicalOrientation;
    }

    public void setPoliticalOrientation(String politicalOrientation) {
        this.politicalOrientation = politicalOrientation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isLgbt() {
        return isLgbt;
    }

    public void setLgbt(boolean lgbt) {
        isLgbt = lgbt;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "LeaderDiversityInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", maritialStatus='" + maritialStatus + '\'' +
                ", sexualOrientation='" + sexualOrientation + '\'' +
                ", politicalOrientation='" + politicalOrientation + '\'' +
                ", color='" + color + '\'' +
                ", language='" + language + '\'' +
                ", isLgbt=" + isLgbt +
                ", isVeteran=" + isVeteran +
                ", isDisable=" + isDisable +
                ", salary=" + salary +
                '}';
    }
}
