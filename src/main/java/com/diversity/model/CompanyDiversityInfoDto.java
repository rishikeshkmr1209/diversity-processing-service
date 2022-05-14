package com.diversity.model;


import com.diversity.entity.LeaderDiversityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import java.util.Set;

public class CompanyDiversityInfoDto
{
    private Long id;
    private String dunsName;
    private String dunsNumber;
    private String county;
    private String phone;
    private String city;
    private String state;
    private String zipCode;

    private String streetAddress;
    private Set<LeaderDiversityInfo> leaders;

    public CompanyDiversityInfoDto() {
    }

    public CompanyDiversityInfoDto(String dunsName, String dunsNumber, String county, String phone, String city, String state, String zipCode, String streetAddress, Set<LeaderDiversityInfo> leaders) {
        this.dunsName = dunsName;
        this.dunsNumber = dunsNumber;
        this.county = county;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
        this.leaders = leaders;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Set<LeaderDiversityInfo> getLeaders() {
        return leaders;
    }

    public void setLeaders(Set<LeaderDiversityInfo> leaders) {
        this.leaders = leaders;
    }

    @Override
    public String toString() {
        return "CompanyDiversityInfoDto{" +
                "id=" + id +
                ", dunsName='" + dunsName + '\'' +
                ", dunsNumber='" + dunsNumber + '\'' +
                ", county='" + county + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", leaders=" + leaders +
                '}';
    }
}
