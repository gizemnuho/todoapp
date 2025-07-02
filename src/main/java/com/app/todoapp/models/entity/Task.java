package com.app.todoapp.models.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "Task")
    private Long id;

    private String title;

    private boolean completed;

}
