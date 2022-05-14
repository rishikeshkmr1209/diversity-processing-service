package com.diversity.helper;

import com.diversity.constant.DiversityConstants;
import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityResponse;

import java.util.Set;

public class ServiceHelper {


    public static CompanyDiversityResponse createCompanyDiversityResponse(CompanyDiversityInfo companyDiversityInfo) {
        CompanyDiversityResponse companyDiversityResponse = new CompanyDiversityResponse();
        if (null != companyDiversityInfo) {

            if (null != companyDiversityInfo.getId()) {
                companyDiversityResponse.setId(companyDiversityInfo.getId());
            }
            if (null != companyDiversityInfo.getDunsNumber()) {
                companyDiversityResponse.setDunsNumber(companyDiversityInfo.getDunsNumber());
            }
            if (null != companyDiversityInfo.getDunsName()) {
                companyDiversityResponse.setDunsName(companyDiversityInfo.getDunsName());
            }
            if (null != companyDiversityInfo.getCounty()) {
                companyDiversityResponse.setCounty(companyDiversityInfo.getCounty());
            }
            if (null != companyDiversityInfo.getPhone()) {
                companyDiversityResponse.setPhone(companyDiversityInfo.getPhone());
            }
            if (null != companyDiversityInfo.getCity()) {
                companyDiversityResponse.setCity(companyDiversityInfo.getCity());
            }
            if (null != companyDiversityInfo.getState()) {
                companyDiversityResponse.setState(companyDiversityInfo.getState());
            }
            if (null != companyDiversityInfo.getZipCode()) {
                companyDiversityResponse.setZipCode(companyDiversityInfo.getZipCode());
            }

            boolean isWomenOwned = false;
            boolean isMinorityOwned = false;
            boolean isVeteranOwned = false;
            boolean isDisabledOwned = false;
            boolean isLgbtOwned = false;

            if (null != companyDiversityInfo.getLeaders()) {
                Set<LeaderDiversityInfo> leaderDiversityInfos = companyDiversityInfo.getLeaders();
                for (LeaderDiversityInfo leaderDiversityInfo : leaderDiversityInfos) {
                    if (leaderDiversityInfo.getSharePercentage() > 50) {

                        if (!isWomenOwned && null != leaderDiversityInfo.getGender() && leaderDiversityInfo.getGender().equalsIgnoreCase("Female")) {
                            isWomenOwned = true;
                            companyDiversityResponse.setIsWomenOwned(DiversityConstants.YES);
                        }
                        if (!isMinorityOwned && null != leaderDiversityInfo.getEthnicity() &&
                                (leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Black") || leaderDiversityInfo.getEthnicity().equalsIgnoreCase("African American") ||
                                        leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Hispanic") || leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Latino") ||
                                        leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Native American") || leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Indigenous") ||
                                        leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Asian-Pacific Americans") || leaderDiversityInfo.getEthnicity().equalsIgnoreCase("Asian-Indian Americans"))

                        ) {
                            isMinorityOwned = true;
                            companyDiversityResponse.setIsMinorityOwned("Yes");
                            companyDiversityResponse.setMinorityDescription(leaderDiversityInfo.getEthnicity());
                        }
                        if (!isVeteranOwned && null != leaderDiversityInfo.getIsVeteran() && leaderDiversityInfo.getIsVeteran().equalsIgnoreCase(DiversityConstants.YES)) {
                            isVeteranOwned = true;
                            companyDiversityResponse.setIsVeteranOwned(DiversityConstants.YES);
                        }
                        if (!isDisabledOwned && null != leaderDiversityInfo.getIsDisable() && leaderDiversityInfo.getIsDisable().equalsIgnoreCase(DiversityConstants.YES)) {
                            isDisabledOwned = true;
                            companyDiversityResponse.setIsDisabledOwned(DiversityConstants.YES);
                        }
                        if (!isLgbtOwned && null != leaderDiversityInfo.getIsLgbt() && leaderDiversityInfo.getIsLgbt().equalsIgnoreCase(DiversityConstants.YES)) {
                            isLgbtOwned = true;
                            companyDiversityResponse.setIsLgbtOwned(DiversityConstants.YES);
                        }


                    }/* else if (leaderDiversityInfo.getSharePercentage() > 0 && leaderDiversityInfo.getSharePercentage() <= 50) {
                        setOwnerShip(companyDiversityResponse, DiversityConstants.NO);
                        continue;
                    } else if (leaderDiversityInfo.getSharePercentage() == 0) {
                        setOwnerShip(companyDiversityResponse, DiversityConstants.NOT_KNOWN);
                        continue;
                    }*/


                }
            }
        }
        return companyDiversityResponse;


    }

    private static void setOwnerShip(CompanyDiversityResponse companyDiversityResponse, String status) {
        companyDiversityResponse.setIsWomenOwned(status);
        companyDiversityResponse.setIsMinorityOwned(status);
        companyDiversityResponse.setMinorityDescription(status);
        companyDiversityResponse.setIsVeteranOwned(status);
        companyDiversityResponse.setIsDisabledOwned(status);
        companyDiversityResponse.setIsLgbtOwned(status);
    }
}

