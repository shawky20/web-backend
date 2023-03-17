package com.backend.webbackend.controller;

import com.backend.webbackend.dao.TeacherRepo;
import com.backend.webbackend.entities.Teacher;
import com.backend.webbackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController
{
    @Autowired
    TeacherService teacherService;
    @PostMapping("/Teacher")
    public void addTeacher(@RequestBody Teacher teacher)
    {
        teacherService.getTeacherRepo().save(teacher);
    }
}
