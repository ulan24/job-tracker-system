package com.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobtracker.entity.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long>  {
    
} 