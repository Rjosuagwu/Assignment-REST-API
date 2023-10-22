package com.example.assignmentmanagementsystem.Assignment.Services;

import com.example.assignmentmanagementsystem.Assignment.Models.AssignmentModel;
import com.example.assignmentmanagementsystem.Assignment.Repositories.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class AssignmentService {
    private final AssignmentRepo assignmentRepo;

    @Autowired
    public AssignmentService(AssignmentRepo assignmentRepo) {
        this.assignmentRepo = assignmentRepo;
    }

    public AssignmentModel addAssignment(AssignmentModel assignmentModel)
    {
        return assignmentRepo.save(assignmentModel);
    }

    public AssignmentModel findAssignmentById(Long id)
    {
        return assignmentRepo.findById(id).orElseThrow(()-> new AssignmentNotFoundException("Assigment with id: " + id + "not found!"));
    }

    public List<AssignmentModel> findAll()
    {
        return assignmentRepo.findAll();
    }

    public void removeAssignmentById(Long id)
    {
        assignmentRepo.deleteById(id);
    }

    public void removeAll()
    {
        assignmentRepo.deleteAll();
    }



}
