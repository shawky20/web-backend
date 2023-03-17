package com.backend.webbackend.service;

import com.backend.webbackend.dao.TeacherRepo;
import com.backend.webbackend.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Teacher> findByMail(String teacherMail)
    {
        return teacherRepo.findByMail(teacherMail);
    }

    public void  deleteTeacher(Long id){
        teacherRepo.deleteById(id);
    }

    public List<Teacher> findByFirstNameAndLastNameIncludingLetterA(){
        return teacherRepo.findByFirstNameAndLastNameIncludingLetterA();
    }
}
