package com.Job.Job_Notification.Service;

import Exceptions.JobNotFoundException;
import com.Job.Job_Notification.Entity.Job;
import com.Job.Job_Notification.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public Job createJob(Job job) {
        return repository.save(job);
    }

    public Optional<Job> getJobById(Integer id) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            return job;
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public void deleteJob(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public Iterable<Job> getAllJobs() {
        return repository.findAll();
    }

    public Iterable<Job> getJobsByCategory(String category) {
        return repository.findByCategory(category);
    }

    public Iterable<Job> getJobsByLocation(String location) {
        return repository.findByLocation(location);
    }

    public Iterable<Job> getJobsByTitle(String jobTitle) {
        return repository.findByJobTitle(jobTitle);
    }

    public Iterable<Job> getJobsByDescription(String description) {
        return repository.findByDescription(description);
    }

    public Iterable<Job> getJobsByRequirements(String requirements) {
        return repository.findByRequirements(requirements);
    }

    public String updateJobTitle(Integer id, String jobTitle) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            Job updatedJob = job.get();
            updatedJob.setJobTitle(jobTitle);
            repository.save(updatedJob);
            return "Job title updated successfully.";
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public String updateDescription(Integer id, String description) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            Job updatedJob = job.get();
            updatedJob.setDescription(description);
            repository.save(updatedJob);
            return "Job description updated successfully.";
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public String updateRequirements(Integer id, String requirements) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            Job updatedJob = job.get();
            updatedJob.setRequirements(requirements);
            repository.save(updatedJob);
            return "Job requirements updated successfully.";
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public String updateCategory(Integer id, String category) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            Job updatedJob = job.get();
            updatedJob.setCategory(category);
            repository.save(updatedJob);
            return "Job category updated successfully.";
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }

    public String updateLocation(Integer id, String location) {
        Optional<Job> job = repository.findById(id);
        if (job.isPresent()) {
            Job updatedJob = job.get();
            updatedJob.setLocation(location);
            repository.save(updatedJob);
            return "Job location updated successfully.";
        } else {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
    }
}
