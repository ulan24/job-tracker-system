package com.jobtracker.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobtracker.entity.JobApplication;
import com.jobtracker.enums.JobStatus;
import com.jobtracker.repository.JobApplicationRepository;
import com.jobtracker.service.JobApplicationService;

@Service
public class JobApplicationServiceImpl implements JobApplicationService{

    private final JobApplicationRepository repository;

    public JobApplicationServiceImpl(JobApplicationRepository repository) {
        this.repository = repository;
    }

    //CREATE
    @Override
    public JobApplication create(JobApplication jobApplication) {
        jobApplication.setStatus(JobStatus.APPLIED);
        return repository.save(jobApplication);
    }

    //getById
    @Override
    public JobApplication getById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("JobApplication not found"));
    }

    //getAll
    @Override
    public List<JobApplication> getAll() {
        return repository.findAll();
    }

    //updateStatus
    @Override
    public JobApplication updateStatus(Long id, JobStatus status) {
        JobApplication application = getById(id);
        application.setStatus(status);
        return repository.save(application);

    }

    //DELETE
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
