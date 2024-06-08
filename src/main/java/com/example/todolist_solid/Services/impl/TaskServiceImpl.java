package com.example.todolist_solid.Services.impl;

import com.example.todolist_solid.Services.TaskService;
import com.example.todolist_solid.models.Task;
import com.example.todolist_solid.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Iterable<Task> getAll() {
        // Buscar tasks os Tasks.
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getById(Long id) {
        Optional<Task> task = taskRepository.findById(String.valueOf(id));
        return task; // No need to call get() here
    }

    @Override
    public void insert(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void update(Long id, Task task) {
        // Buscar Task por ID, caso exista:
        Optional<Task> taskBd = taskRepository.findById(String.valueOf(id));
        if (taskBd.isPresent()) {
            taskRepository.save(task);
        }
    }

    @Override
    public void delete(Long id) {
        // Deletar Task por ID.
        taskRepository.deleteById(String.valueOf(id));
    }
}
