package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.util.List;

@Data
@Document(collection = "jobs")
public class Job {
    @Id
    private String id;
    private String title;
    private String description;
    private String clientId; // Reference to User
    private List<String> requiredSkills;
    private double budget;
    private String status; // "open", "in-progress", "completed"
}
