package com.assignment.jobmatchai.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "job")
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String company;

    private String location;

    private String experience;

    private String salary;

    @Column(length = 5000)
    private String description;

    private LocalDate postedDate;
}
