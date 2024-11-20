package com.example.demo.Service;

import com.example.demo.model.Job;

import java.util.List;

public interface JobServiceInterface {


    List<Job> findAll();

    void createJob(Job job);

    Job findById(Long id);
}
