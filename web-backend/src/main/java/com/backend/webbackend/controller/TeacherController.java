package com.backend.webbackend.controller;

import com.backend.webbackend.dao.TeacherRepo;
import com.backend.webbackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController
{
    @Autowired
    TeacherService teacherService;
    @GetMapping("/Teacher")
    public String getTeacherModel()
    {
        return "Hello";
    }
    @PostMapping("/Teacher")
    public String postTeacherModel()
    {
        return "Hello";
    }
}
