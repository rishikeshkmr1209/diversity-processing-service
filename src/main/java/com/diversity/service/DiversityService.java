package com.diversity.service;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.mapper.DtoToEntity;
import com.diversity.mapper.EntityToDto;
import com.diversity.model.CompanyDiversityInfoDto;
import com.diversity.model.EmployeeDto;
import com.diversity.repo.CompanyDiversityInfoRepository;
import com.diversity.repo.LeaderDiversityInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DiversityService {


    @Autowired
    private LeaderDiversityInfoRepository leaderDiversityInfoRepository;

    @Autowired
    private CompanyDiversityInfoRepository companyDiversityInfoRepository;

    public void updateCompanyDiversityInformation(CompanyDiversityInfoDto companyDiversityInfoDto) {
        CompanyDiversityInfo companyDiversityInfo=DtoToEntity.mapCompanyDiversityInfoDtoToEntity(companyDiversityInfoDto);
            companyDiversityInfoRepository.save(companyDiversityInfo);
    }

    public List<CompanyDiversityInfoDto> getAllCompanies() {
        List<CompanyDiversityInfo> companyDiversityInfos = companyDiversityInfoRepository.findAll();

        return EntityToDto.mapListCompanyDiversityEntityToDto(companyDiversityInfos);
    }

    public CompanyDiversityInfoDto getCompanyByName(String companyName) {
        CompanyDiversityInfo companyDiversityInfo = companyDiversityInfoRepository.findByCompanyName(companyName);
        return EntityToDto.mapCompanyDiversityEntityToDto(companyDiversityInfo);
    }
}
