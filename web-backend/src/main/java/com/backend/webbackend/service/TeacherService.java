package com.backend.webbackend.service;

import com.backend.webbackend.dao.TeacherRepo;
import com.backend.webbackend.entities.Teacher;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService
{
    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher addTeacher(Teacher teacher)
    {
        teacherRepo.save(teacher);
        return teacher;
    }
}
