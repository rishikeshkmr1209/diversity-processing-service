package com.diversity.helper;

import com.diversity.constant.DiversityConstants;
import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.model.CompanyDiversityResponse;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
            if (null != companyDiversityInfo.getStreetAddress()) {
                companyDiversityResponse.setStreetAddress(companyDiversityInfo.getStreetAddress());
            }
            if (null != companyDiversityInfo.getLeaders()) {
                companyDiversityResponse.setLeaders(companyDiversityInfo.getLeaders());
            }


            //logic to identify ownership of different diversity parameters
            boolean isWomenOwned = false;
            boolean isMinorityOwned = false;
            boolean isVeteranOwned = false;
            boolean isDisabledOwned = false;
            boolean isLgbtOwned = false;

            if (null != companyDiversityInfo.getLeaders()) {
                Set<LeaderDiversityInfo> leaderDiversityInfos = companyDiversityInfo.getLeaders();

                boolean isSharePercentageSet = false;

                for (LeaderDiversityInfo leaderDiversityInfo : leaderDiversityInfos) {
                    if (leaderDiversityInfo.getSharePercentage() > 0) {
                        isSharePercentageSet = true;

                    }

                }
                if (!isSharePercentageSet) { // If none of the leaders have share percentage data,set all diversity ownership as "NOT KNOWN"
                    companyDiversityResponse.setIsWomenOwned(DiversityConstants.NOT_KNOWN);
                    companyDiversityResponse.setIsMinorityOwned(DiversityConstants.NOT_KNOWN);
                    companyDiversityResponse.setMinorityDescription(DiversityConstants.NOT_KNOWN);
                    companyDiversityResponse.setIsDisabledOwned(DiversityConstants.NOT_KNOWN);
                    companyDiversityResponse.setIsLgbtOwned(DiversityConstants.NOT_KNOWN);

                } else {

                    List<LeaderDiversityInfo> leaderDiversityInfoList = leaderDiversityInfos.stream().filter(leaderDiversityInfo -> {
                        if (leaderDiversityInfo.getSharePercentage() > 0) {
                            return true;
                        }
                        return false;
                    }).collect(Collectors.toList());


                    for (LeaderDiversityInfo leaderDiversityInfo : leaderDiversityInfoList) {

                        if (leaderDiversityInfo.getSharePercentage() > 50) {

                            if (!isWomenOwned && null != leaderDiversityInfo.getGender() && leaderDiversityInfo.getGender().equalsIgnoreCase("F")) {
                                isWomenOwned = true;
                                companyDiversityResponse.setIsWomenOwned(DiversityConstants.YES);
                            }
                            if (!isMinorityOwned && null != leaderDiversityInfo.getEthnicity() &&
                                    (leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.BLACK) || leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.AFRICAN_AMERICAN) ||
                                            leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.HISPANIC) || leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.LATINO) ||
                                            leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.NATIVE_AMERICAN) || leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.INDIGENOUS) ||
                                            leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.ASIAN_PACIFIC_AMERICANS) || leaderDiversityInfo.getEthnicity().equalsIgnoreCase(DiversityConstants.ASIAN_INDIAN_AMERICANS))

                            ) {
                                isMinorityOwned = true;
                                companyDiversityResponse.setIsMinorityOwned(DiversityConstants.YES);
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


                        }
                    }


                    //logic of ownership for those leaders whose 0<"share percentage"< 50
                    boolean isWomenOwned2 = false;
                    boolean isMinorityOwned2 = false;
                    boolean isVeteranOwned2 = false;
                    boolean isDisabledOwned2 = false;
                    boolean isLgbtOwned2 = false;


                    for (LeaderDiversityInfo leaderDiversityInfo : leaderDiversityInfoList) {

                        if (leaderDiversityInfo.getSharePercentage() >= 0 && leaderDiversityInfo.getSharePercentage() < 50) {

                            isWomenOwned2 = identifyWomenOwnership(companyDiversityResponse, isWomenOwned2, leaderDiversityInfo);
                            isMinorityOwned2 = identifyMinorityOwnership(companyDiversityResponse, isMinorityOwned2, leaderDiversityInfo);
                            isVeteranOwned2 = identifyVeteranOwnership(companyDiversityResponse, isVeteranOwned2, leaderDiversityInfo);
                            isDisabledOwned2 = identifyDisabledOwnership(companyDiversityResponse, isDisabledOwned2, leaderDiversityInfo);
                            isLgbtOwned2 = identifyLgbtOwnership(companyDiversityResponse, isLgbtOwned2, leaderDiversityInfo);

                        }
                    }

                    setDiversityOwnershipStatus(companyDiversityResponse, isWomenOwned, isMinorityOwned, isVeteranOwned, isDisabledOwned, isLgbtOwned, isWomenOwned2, isMinorityOwned2, isVeteranOwned2, isDisabledOwned2, isLgbtOwned2);


                }

            }
        }
        return companyDiversityResponse;


    }

    private static boolean identifyLgbtOwnership(CompanyDiversityResponse companyDiversityResponse, boolean isLgbtOwned2, LeaderDiversityInfo leaderDiversityInfo) {
        if (null == companyDiversityResponse.getIsLgbtOwned()) {

            if (null != leaderDiversityInfo.getIsLgbt()) {
                isLgbtOwned2 = isLgbtOwned2 || true;
            } else {
                isLgbtOwned2 = isLgbtOwned2 || false;
            }
        }
        return isLgbtOwned2;
    }

    private static boolean identifyDisabledOwnership(CompanyDiversityResponse companyDiversityResponse, boolean isDisabledOwned2, LeaderDiversityInfo leaderDiversityInfo) {
        if (null == companyDiversityResponse.getIsDisabledOwned()) {

            if (null != leaderDiversityInfo.getIsDisable()) {
                isDisabledOwned2 = isDisabledOwned2 || true;
            } else {
                isDisabledOwned2 = isDisabledOwned2 || false;
            }
        }
        return isDisabledOwned2;
    }

    private static boolean identifyVeteranOwnership(CompanyDiversityResponse companyDiversityResponse, boolean isVeteranOwned2, LeaderDiversityInfo leaderDiversityInfo) {
        if (null == companyDiversityResponse.getIsVeteranOwned()) {

            if (null != leaderDiversityInfo.getIsVeteran()) {
                isVeteranOwned2 = isVeteranOwned2 || true;
            } else {
                isVeteranOwned2 = isVeteranOwned2 || false;
            }
        }
        return isVeteranOwned2;
    }

    private static boolean identifyMinorityOwnership(CompanyDiversityResponse companyDiversityResponse, boolean isMinorityOwned2, LeaderDiversityInfo leaderDiversityInfo) {
        if (null == companyDiversityResponse.getIsMinorityOwned()) {

            if (null != leaderDiversityInfo.getEthnicity()) {
                isMinorityOwned2 = isMinorityOwned2 || true;
            } else {
                isMinorityOwned2 = isMinorityOwned2 || false;
            }
        }
        return isMinorityOwned2;
    }

    private static boolean identifyWomenOwnership(CompanyDiversityResponse companyDiversityResponse, boolean isWomenOwned2, LeaderDiversityInfo leaderDiversityInfo) {
        if (null == companyDiversityResponse.getIsWomenOwned()) {
            if (null != leaderDiversityInfo.getGender()) {
                isWomenOwned2 = isWomenOwned2 || true;
            } else {
                isWomenOwned2 = isWomenOwned2 || false;

            }
        }
        return isWomenOwned2;
    }

    private static void setDiversityOwnershipStatus(CompanyDiversityResponse companyDiversityResponse, boolean isWomenOwned, boolean isMinorityOwned, boolean isVeteranOwned, boolean isDisabledOwned, boolean isLgbtOwned, boolean isWomenOwned2, boolean isMinorityOwned2, boolean isVeteranOwned2, boolean isDisabledOwned2, boolean isLgbtOwned2) {
        if (!isWomenOwned) {
            if (!isWomenOwned2) {
                companyDiversityResponse.setIsWomenOwned(DiversityConstants.NOT_KNOWN);
            } else {
                companyDiversityResponse.setIsWomenOwned(DiversityConstants.NO);

            }
        }

        if (!isMinorityOwned) {
            if (!isMinorityOwned2) {
                companyDiversityResponse.setIsMinorityOwned(DiversityConstants.NOT_KNOWN);
            } else {
                companyDiversityResponse.setIsMinorityOwned(DiversityConstants.NO);

            }
        }


        if (!isVeteranOwned) {
            if (!isVeteranOwned2) {
                companyDiversityResponse.setIsVeteranOwned(DiversityConstants.NOT_KNOWN);
            } else {
                companyDiversityResponse.setIsVeteranOwned(DiversityConstants.NO);

            }
        }

        if (!isDisabledOwned) {
            if (!isDisabledOwned2) {
                companyDiversityResponse.setIsDisabledOwned(DiversityConstants.NOT_KNOWN);
            } else {
                companyDiversityResponse.setIsDisabledOwned(DiversityConstants.NO);

            }
        }

        if (!isLgbtOwned) {
            if (!isLgbtOwned2) {
                companyDiversityResponse.setIsLgbtOwned(DiversityConstants.NOT_KNOWN);
            } else {
                companyDiversityResponse.setIsLgbtOwned(DiversityConstants.NO);

            }
        }

    }


}

