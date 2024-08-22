package com.example.flawtrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flawtrack.model.Contact;
import com.example.flawtrack.repository.ContactRepository;

@RestController
@RequestMapping
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/contactform")
    public ResponseEntity<String> submitContactForm(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        Contact contact = new Contact(name, email, message);
        contactRepository.save(contact);
        return ResponseEntity.ok("Thank you for your message!");
    }
}