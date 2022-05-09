package com.diversity.entity;

import com.diversity.enums.Enums;

import javax.persistence.*;

@Entity
@Table (name= "TBL_DIV_LEADER")
public class LeaderDiversityInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="NAME")
    private String name;
    @Column(name="COMPANY_NAME")
    private String companyName;
    @Column(name="MOBILE_NBR")
    private String mobileNumber;
    @Column(name="EMAIL_ID")
    private String emailId;
    @Column(name="GENDER")
    private String gender;
    @Column(name="NATIONALITY")
    private String nationality;
    @Column(name="RELIGION")
    private String religion;
    @Column(name="MARITAL_ST")
    private String maritialStatus;
    @Column(name="SEXUAL_ORIENT")
    private String sexualOrientation;
    @Column(name="POLITICAL_ORIENT")
    private String politicalOrientation;
    @Column(name="COLOR")
    private String color;
    @Column(name="LANG")
    private String language;
    @Column(name="LGBT")
    private String isLgbt;
    @Column(name="VETERAN")
    private String isVeteran;
    @Column(name="DISABLED")
    private String isDisable;
    @Column(name="SALARY")
    private long salary;

    @ManyToOne
    @JoinColumn(name="company_diversity_info_id")
    private CompanyDiversityInfo companyDiversityInfo;

    public LeaderDiversityInfo() {
    }

    public LeaderDiversityInfo(String name, String companyName, String mobileNumber, String emailId, String gender, String nationality, String religion, String maritialStatus, String sexualOrientation, String politicalOrientation, String color, String language, String isLgbt, String isVeteran, String isDisable, long salary) {
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

    public String isLgbt() {
        return isLgbt;
    }

    public void setLgbt(String lgbt) {
        this.isLgbt = lgbt;
    }

    public String isVeteran() {
        return isVeteran;
    }

    public void setVeteran(String veteran) {
        this.isVeteran = veteran;
    }

    public String isDisable() {
        return isDisable;
    }

    public void setDisable(String disable) {
        this.isDisable = disable;
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
