package com.Job.Job_Notification.Controller;

import Exceptions.JobNotFoundException;
import com.Job.Job_Notification.Entity.Job;

import com.Job.Job_Notification.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService service;
    @PostMapping("/addjob")
    public Job createJob(@RequestBody Job job) {
        return service.createJob(job);
    }
    @GetMapping("/{id}")

        public Optional<Job> getJobById (@PathVariable Integer  id){
        return service.getJobById(id);
    }

    @PutMapping("update/{id}/jobtitle")
    public String updateJob(@PathVariable Integer id,@RequestParam String jobTitle) {
        return service.updateJobTitle(id,jobTitle);
    }
    @PutMapping("update/{id}/description")
    public String updateDescription(@PathVariable Integer id, @RequestParam String description) {
        return service.updateDescription(id, description);
    }
    @PutMapping("update/{id}/requirements")
    public String updateRequirements(@PathVariable Integer id, @RequestParam String requirements) {
        return service.updateRequirements(id, requirements);
    }
    @PutMapping("update/{id}/category")
    public String updateCategory(@PathVariable Integer id, @RequestParam String category) {
        return service.updateCategory(id, category);
    }
    @PutMapping("update/{id}/location")
    public String updateLocation(@PathVariable Integer id, @RequestParam String location) {
        return service.updateLocation(id, location);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteJob(@PathVariable Integer id) {
        service.deleteJob(id);
    }
    @GetMapping("/getalljobs")
    public Iterable<Job> getAllJobs() {
        return service.getAllJobs();
    }
    @GetMapping("/getjobsbycategory/{category}")
    public Iterable<Job> getJobsByCategory(@PathVariable String category) {
        return service.getJobsByCategory(category);
    }
    @GetMapping("/getjobsbylocation/{location}")
    public Iterable<Job> getJobsByLocation(@PathVariable String location) {
        return service.getJobsByLocation(location);
    }
    @GetMapping("/getjobsbytitle/{jobTitle}")
    public Iterable<Job> getJobsByTitle(@PathVariable String jobTitle) {
        return service.getJobsByTitle(jobTitle);
    }
    @GetMapping("/getjobsbydescription/{requirements}")
    public Iterable<Job> getJobsByDescription(@PathVariable String requirements) {
        return service.getJobsByDescription(requirements);
    }
}
