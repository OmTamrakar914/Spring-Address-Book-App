package com.bridgelabz.addressbook.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    @GetMapping("/contacts")
    public ResponseEntity<String> getAllContacts() {
        return ResponseEntity.ok("{\"message\": \"Fetching all contacts...\"}");
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity<String> getContactById(@PathVariable int id) {
        return ResponseEntity.ok("{\"message\": \"Fetching contact with ID: " + id + "\"}");
    }

    @PostMapping("/contacts")
    public ResponseEntity<String> addContact(@RequestBody String contact) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("{\"message\": \"Adding new contact: " + contact + "\"}");
    }

    @PutMapping("/contacts/{id}")
    public ResponseEntity<String> updateContact(@PathVariable int id, @RequestBody String contact) {
        return ResponseEntity.ok("{\"message\": \"Updating contact with ID: " + id + " to: " + contact + "\"}");
    }

    @DeleteMapping("/contacts/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body("{\"message\": \"Deleting contact with ID: " + id + "\"}");
    }
}