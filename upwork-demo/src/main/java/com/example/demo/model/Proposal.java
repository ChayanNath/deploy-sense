package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "proposals")
public class Proposal {
    @Id
    private String id;
    private String jobId;
    private String freelancerId;
    private String coverLetter;
    private double bidAmount;
    private String status;
}
