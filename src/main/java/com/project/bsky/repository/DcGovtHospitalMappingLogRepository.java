package com.project.bsky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bsky.model.DcGovtHospitalMappingLog;

@Repository
public interface DcGovtHospitalMappingLogRepository extends JpaRepository<DcGovtHospitalMappingLog, Long>{

}