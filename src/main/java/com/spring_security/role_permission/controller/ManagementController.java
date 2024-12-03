package com.spring_security.role_permission.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {
    @GetMapping
    public String get() {
        return "GET:: management adminController";
    }

    @PostMapping
    public String post() {
        return "POST:: management adminController";
    }

    @PutMapping
    public String update() {
        return "UPDATE:: management adminController";
    }

    @DeleteMapping
    public String delete() {

        return "DELETE:: management adminController";
    }

}
