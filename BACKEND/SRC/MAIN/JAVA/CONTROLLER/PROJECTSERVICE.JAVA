package com.portfolio.service;

import com.portfolio.model.Project;
import com.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository repo;

    public List<Project> getAll() {
        return repo.findAll();
    }

    public Project save(Project p) {
        return repo.save(p);
    }
}