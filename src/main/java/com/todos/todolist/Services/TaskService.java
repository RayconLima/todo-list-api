package com.todos.todolist.Services;

import com.todos.todolist.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAll();

    Optional<Task> getById(Long id);

//    List<Task> getTaskById(Long id);

    List<Task> insert(Task task);

    List<Task> update(Long id, Task task);

    List<Task> delete(Long id);
}
