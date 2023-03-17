package com.backend.webbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Teacher")
@Data
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;

    @Column(name = "mail")
    private String mail;


}
