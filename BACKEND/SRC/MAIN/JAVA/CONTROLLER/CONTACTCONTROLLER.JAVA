package com.portfolio.controller;

import com.portfolio.model.ContactMessage;
import com.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @PostMapping
    public String saveMessage(@RequestBody ContactMessage msg) {
        repo.save(msg);
        return "Message saved for: " + msg.getName();
    }

    @GetMapping
    public List<ContactMessage> getAllMessages() { return repo.findAll(); }
}