package com.diversity.repo;

import com.diversity.entity.CompanyDiversityInfo;
import com.diversity.entity.LeaderDiversityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDiversityInfoRepository extends JpaRepository<CompanyDiversityInfo, Integer> {

    CompanyDiversityInfo findByDunsName(String dunsName);
}
