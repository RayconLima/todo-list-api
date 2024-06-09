package com.example.todolist_solid.Services;

import com.example.todolist_solid.models.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> getAll();

    Optional<Todo> getById(Long id);

    Optional<Object> getTaskById(Long id);

    List<Todo> insert(Todo todo);

    List<Todo> update(Long id, Todo todo);

    List<Todo> delete(Long id);
}
