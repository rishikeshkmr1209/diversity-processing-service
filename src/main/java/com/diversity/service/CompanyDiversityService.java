package com.diversity.service;

import com.diversity.constant.DiversityConstants;
import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.diversity.exception.Constants;
import com.diversity.exception.RecordNotFoundException;
import com.diversity.helper.ServiceHelper;
import com.diversity.mapper.DtoToEntity;
import com.diversity.mapper.EntityToDto;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.CompanyDiversityResponse;
import com.diversity.repo.CompanyDiversityInfoRepository;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CompanyDiversityService {

    Logger logger = LoggerFactory.getLogger(CompanyDiversityService.class);

    @Autowired
    private CompanyDiversityInfoRepository companyDiversityInfoRepository;

    public void updateCompanyDiversityInformation(CompanyDiversityInfoDto companyDiversityInfoDto) {

        CompanyDiversityInfo companyDiversityInfo = DtoToEntity.mapCompanyDiversityInfoDtoToEntity(companyDiversityInfoDto);

        companyDiversityInfoRepository.save(companyDiversityInfo);
    }

    public List<CompanyDiversityInfoDto> getAllCompanies() {

        var companyDiversityIterable = companyDiversityInfoRepository.findAll();
        List<CompanyDiversityInfo> companyDiversityInfos = StreamSupport.stream(companyDiversityIterable.spliterator(), false).collect(Collectors.toList());
        if (companyDiversityInfos.isEmpty())
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        return EntityToDto.mapListCompanyDiversityEntityToDto(companyDiversityInfos);
    }

    public CompanyDiversityInfoDto getCompanyByName(String dunsName) {
        CompanyDiversityInfo companyDiversityInfo = companyDiversityInfoRepository.findByDunsName(dunsName);
        if (companyDiversityInfo == null)
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);
        return EntityToDto.mapCompanyDiversityEntityToDto(companyDiversityInfo);
    }

    public CompanyDiversityResponse getCompanyByDunsName(String dunsName) {
        CompanyDiversityInfo companyDiversityInfo = companyDiversityInfoRepository.findByDunsName(dunsName);
        if (companyDiversityInfo == null)
            throw new RecordNotFoundException(Constants.MSG_RECORD_NOT_FOUND);

        CompanyDiversityResponse companyDiversityResponse = ServiceHelper.createCompanyDiversityResponse(companyDiversityInfo);
        return companyDiversityResponse;
    }


}
