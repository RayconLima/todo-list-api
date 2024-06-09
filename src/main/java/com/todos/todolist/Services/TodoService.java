package com.todos.todolist.Services;

import com.todos.todolist.models.Todo;

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
