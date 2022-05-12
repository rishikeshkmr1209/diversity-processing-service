package com.diversity.model;

import com.diversity.entity.CompanyDiversityInfo;

public class LeaderDiversityInfoDto {

    private Integer id;
    private String name;
    private String gender;
    private String ethnicity;
    private String isLgbt;
    private String isVeteran;
    private String isDisable;
    private long sharePercentage;

/*    private String companyName;
    private String mobileNumber;
    private String emailId;*/
/*    private String religion;
    private String maritialStatus;
    private String sexualOrientation;
    private String politicalOrientation;
    private String color;
    private String language;*/
   // private long salary;

//    private CompanyDiversityInfo companyDiversityInfo;

    public LeaderDiversityInfoDto() {
    }

    public LeaderDiversityInfoDto(Integer id, String name, String gender, String ethnicity, String isLgbt, String isVeteran, String isDisable, long sharePercentage) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.isLgbt = isLgbt;
        this.isVeteran = isVeteran;
        this.isDisable = isDisable;
        this.sharePercentage = sharePercentage;
      //  this.companyDiversityInfo = companyDiversityInfo;
    }

/*
    public LeaderDiversityInfoDto(String name, String companyName, String mobileNumber, String emailId, String gender, String nationality, String religion, String maritialStatus, String sexualOrientation, String politicalOrientation, String color, String language, String isLgbt, String isVeteran, String isDisable, long salary) {
        this.name = name;
        this.companyName = companyName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.gender = gender;
        this.ethnicity = nationality;

        this.isLgbt = isLgbt;
        this.isVeteran = isVeteran;
        this.isDisable = isDisable;
*/
/*        this.religion = religion;
        this.maritialStatus = maritialStatus;
        this.sexualOrientation = sexualOrientation;
        this.politicalOrientation = politicalOrientation;
        this.color = color;
        this.language = language;*//*

       // this.salary = salary;
    }
*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String isLgbt() {
        return isLgbt;
    }

    public void setLgbt(String lgbt) {
        isLgbt = lgbt;
    }

    public String isVeteran() {
        return isVeteran;
    }

    public void setVeteran(String veteran) {
        isVeteran = veteran;
    }

    public String isDisable() {
        return isDisable;
    }

    public void setDisable(String disable) {
        isDisable = disable;
    }

    public long getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(long sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    /*public String getCompanyName() {
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
*/


/*    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }*/

    @Override
    public String toString() {
        return "LeaderDiversityInfoDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", isLgbt='" + isLgbt + '\'' +
                ", isVeteran='" + isVeteran + '\'' +
                ", isDisable='" + isDisable + '\'' +
                ", sharePercentage=" + sharePercentage +
                '}';
    }



}
