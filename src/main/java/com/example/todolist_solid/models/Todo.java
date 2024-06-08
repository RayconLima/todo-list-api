package com.example.todolist_solid.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Boolean finished;
    private int priority;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "todo_id", referencedColumnName = "id")
    Set<Task> tasks = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription() {

        return description;
    }

    public Boolean getFinished()
    {
        return finished;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Set<Task> getTasks() {
        return this.tasks;
    }
}
