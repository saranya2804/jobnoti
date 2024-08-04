package com.Job.Job_Notification.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jobs")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
public class Job {
    @Id
    public int id;
    public String jobTitle;
    public String location;
    public String category;
    public String description;
    public String requirements;

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
