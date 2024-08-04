package com.Job.Job_Notification.Repository;

import com.Job.Job_Notification.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    Iterable<Job> findByCategory(String category);

    Iterable<Job> findByLocation(String location);

    Iterable<Job> findByJobTitle(String jobTitle);

    Iterable<Job> findByRequirements(String requirements);

    Iterable<Job> findByDescription(String description);
}
