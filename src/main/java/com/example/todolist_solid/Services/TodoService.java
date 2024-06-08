package com.example.todolist_solid.Services;

import com.example.todolist_solid.models.Todo;

import java.util.Optional;

public interface TodoService {
    Iterable<Todo> getAll();

    Optional<Todo> getById(Long id);

    void insert(Todo todo);

    void update(Long id, Todo todo);

    void delete(Long id);
}
