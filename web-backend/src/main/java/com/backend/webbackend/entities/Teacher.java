package com.backend.webbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Teacher")
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "f_name")
    String firstName;
    @Column(name = "l_name")
    String lastName;

    @Column(name = "mail")
    String mail;


}
