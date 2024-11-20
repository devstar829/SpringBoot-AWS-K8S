package com.example.demo.impl;
import com.example.demo.Service.JobServiceInterface;
import com.example.demo.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService implements JobServiceInterface{

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll(){
        return jobs;
    }

    @Override
    public void createJob(Job job){
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job findById(Long id){
        for(Job job : jobs){
            if(job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }
}
