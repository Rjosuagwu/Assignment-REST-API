package com.example.assignmentmanagementsystem.Assignment.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.assignmentmanagementsystem.Assignment.Services.AssignmentService;
import com.example.assignmentmanagementsystem.Assignment.Models.AssignmentModel;
import java.util.List;

@RestController
@RequestMapping("/Assignments")
public class AssignmentController {

    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PutMapping("/addAssignment")
    public AssignmentModel addAssignment(@RequestBody AssignmentModel assignmentModel)
    {
        return assignmentService.addAssignment(assignmentModel);
    }

    @GetMapping("/findAssignment/{id}")
    public AssignmentModel findById(@PathVariable Long id)
    {
        return assignmentService.findAssignmentById(id);
    }

    @GetMapping("/all")
    public List<AssignmentModel> findAll()
    {
        return assignmentService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id)
    {
        assignmentService.removeAssignmentById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll()
    {
        assignmentService.removeAll();
    }
}
