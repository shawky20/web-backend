package com.backend.webbackend.dao;

import com.backend.webbackend.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource
public interface TeacherRepo extends JpaRepository <Teacher,Long>
{
    List<Teacher>  findByMail(String mail);
    @Query(value = "select * from teacher t where t.f_name LIKE '%a%' or t.l_name LIKE '%a%' ", nativeQuery = true)
    List<Teacher> findByFirstNameAndLastNameIncludingLetterA();
}