package com.jobtracker.service;

import java.util.List;

import com.jobtracker.entity.JobApplication;
import com.jobtracker.enums.JobStatus;

public interface JobApplicationService {

    JobApplication create(JobApplication jobApplication);

    JobApplication getById(Long id);

    List<JobApplication> getAll();

    JobApplication updateStatus(Long id, JobStatus status);

    void delete(Long id);
}
