package com.todos.todolist_solid.Services.impl;

import com.todos.todolist_solid.Services.TaskService;
import com.todos.todolist_solid.models.Task;
import com.todos.todolist_solid.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAll() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public Optional<Task> getById(Long id) {
        Optional<Task> task = taskRepository.findById(String.valueOf(id));
        return task;
    }

    @Override
    public List<Task> insert(Task task) {
        taskRepository.save(task);
        return getAll();
    }

    @Override
    public List<Task> update(Long id, Task task) {
        Optional<Task> taskBd = taskRepository.findById(String.valueOf(id));
        if (taskBd.isPresent()) {
            taskRepository.save(task);
        }

        return getAll();
    }

    @Override
    public List<Task> delete(Long id) {
        taskRepository.deleteById(String.valueOf(id));
        return getAll();
    }
}
