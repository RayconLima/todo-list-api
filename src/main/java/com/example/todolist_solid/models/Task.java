package com.example.todolist_solid.models;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "todo_id")
    Long todoId;

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTodoId(String todoId)
    {
        this.todoId = Long.valueOf(todoId);
    }
}
