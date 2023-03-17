package com.backend.webbackend.dao;

import com.backend.webbackend.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository <Teacher,Long>
{

}
