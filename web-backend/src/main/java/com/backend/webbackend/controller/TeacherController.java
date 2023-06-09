package com.backend.webbackend.controller;

import com.backend.webbackend.dao.TeacherRepo;
import com.backend.webbackend.entities.Teacher;
import com.backend.webbackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TeacherController
{
    @Autowired
    TeacherService teacherService;
    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/findByMail")
    public Teacher findByMail(@RequestBody String mail)
    {
        return teacherService.findByMail(mail);
    }

    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestBody Long id){
        teacherService.deleteTeacher(id);
    }

    @GetMapping("/getAllIncludingLetterA")
    public List<Teacher> findByFirstNameAndLastNameIncludingLetterA(){
        return teacherService.findByFirstNameAndLastNameIncludingLetterA();
    }

}
