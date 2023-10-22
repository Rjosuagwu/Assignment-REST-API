package com.example.assignmentmanagementsystem.Assignment.Repositories;

import com.example.assignmentmanagementsystem.Assignment.Models.AssignmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepo extends JpaRepository<AssignmentModel, Long> {
}
