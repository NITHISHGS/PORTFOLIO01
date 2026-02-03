package com.portfolio.controller;

import com.portfolio.model.Project;
import com.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping
    public List<Project> getAll() { return service.getAll(); }

    @PostMapping
    public Project save(@RequestBody Project p) { return service.save(p); }

    @PutMapping("/update")
    public Project update(@RequestBody Project p) { return service.save(p); }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}