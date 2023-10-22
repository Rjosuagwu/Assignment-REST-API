package com.example.assignmentmanagementsystem.Assignment.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentModel {


    @Id // Primary Key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime dueDate;
    private String difficulty;
    private String course;
    private String topic;
    private String description;

    public LocalDateTime getDueData()
    {
        return dueDate;
    }

}
