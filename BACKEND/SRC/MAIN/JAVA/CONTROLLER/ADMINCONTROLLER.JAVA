package com.portfolio.controller;
import com.portfolio.model.Admin;
import com.portfolio.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public ResponseEntity<Admin> login(@RequestBody Admin admin) {
        Admin a = service.login(admin.getUsername(), admin.getPassword());
        if (a != null) return ResponseEntity.ok(a);
        return ResponseEntity.status(401).build();
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
        Admin updatedAdmin = service.updateAdmin(admin);
        if (updatedAdmin != null) return ResponseEntity.ok(updatedAdmin);
        return ResponseEntity.status(404).build();
    }
}
