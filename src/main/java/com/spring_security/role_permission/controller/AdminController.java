package com.spring_security.role_permission.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public String get() {
        return "GET:: adminController";
    }

    @PostMapping
    public String post() {
        return "POST:: adminController";
    }

    @PutMapping
    public String update() {
        return "UPDATE:: adminController";
    }

    @DeleteMapping
    public String delete() {

        return "DELETE:: adminController";
    }

}
