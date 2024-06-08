package com.example.todolist_solid.Services;

import com.example.todolist_solid.models.Task;

import java.util.Optional;

public interface TaskService {
    Iterable<Task> getAll();

    Optional<Task> getById(Long id);

    void insert(Task task);

    void update(Long id, Task task);

    void delete(Long id);
}
