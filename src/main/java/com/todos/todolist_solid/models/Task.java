package com.todos.todolist_solid.models;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Boolean finished;
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

    public Boolean getFinished()
    {
        return finished;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setFinished(Boolean finished)
    {
        this.finished = finished;
    }

    public void setTodoId(String todoId)
    {
        this.todoId = Long.valueOf(todoId);
    }
}
