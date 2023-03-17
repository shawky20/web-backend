package com.backend.webbackend.dao;

import com.backend.webbackend.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface TeacherRepo extends JpaRepository <Teacher,Long>
{

}
