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

    public String getIsLgbt() {
        return isLgbt;
    }

    public void setIsLgbt(String isLgbt) {
        this.isLgbt = isLgbt;
    }

    public String getIsVeteran() {
        return isVeteran;
    }

    public void setIsVeteran(String isVeteran) {
        this.isVeteran = isVeteran;
    }

    public String getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(String isDisable) {
        this.isDisable = isDisable;
    }

    public long getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(long sharePercentage) {
        this.sharePercentage = sharePercentage;
    }



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
