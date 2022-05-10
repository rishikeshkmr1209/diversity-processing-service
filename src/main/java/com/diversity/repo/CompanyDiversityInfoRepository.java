package com.diversity.repo;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import com.yugabyte.data.jdbc.repository.YsqlRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDiversityInfoRepository extends YsqlRepository<CompanyDiversityInfo, Integer> {

    CompanyDiversityInfo findByCompanyName(String companyName);
}
