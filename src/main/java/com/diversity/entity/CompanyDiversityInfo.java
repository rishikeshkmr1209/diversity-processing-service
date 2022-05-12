package com.diversity.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class CompanyDiversityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dunsNumber;
    private String dunsName;
    private String county;
    private String phone;
    private String city;
    private String state;
    private String zipCode;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<LeaderDiversityInfo> leaders;

    public CompanyDiversityInfo() {
    }

    public CompanyDiversityInfo(String dunsName, String dunsNumber, String phone, String county, String city, String state, String zipCode, Set<LeaderDiversityInfo> leaders) {
        this.dunsName = dunsName;
        this.dunsNumber = dunsNumber;
        this.phone = phone;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.leaders = leaders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDunsNumber() {
        return dunsNumber;
    }

    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    public String getDunsName() {
        return dunsName;
    }

    public void setDunsName(String dunsName) {
        this.dunsName = dunsName;
    }


    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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

    public Set<LeaderDiversityInfo> getLeaders() {
        return leaders;
    }

    public void setLeaders(Set<LeaderDiversityInfo> leaders) {
        this.leaders = leaders;
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

    @Override
    public String toString() {
        return "CompanyDiversityInfo{" +
                "id=" + id +
                ", dunsNumber='" + dunsNumber + '\'' +
                ", dunsName='" + dunsName + '\'' +
                ", county='" + county + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", leaders=" + leaders +
                '}';
    }

}
