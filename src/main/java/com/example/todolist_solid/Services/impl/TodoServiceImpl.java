package com.example.todolist_solid.Services.impl;

import com.example.todolist_solid.Services.TodoService;
import com.example.todolist_solid.models.Todo;
import com.example.todolist_solid.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Iterable<Todo> getAll()
    {
        // Buscar todos os Todos.
        return todoRepository.findAll();
    }

    @Override
    public Optional<Todo> getById(Long id) {
        Optional<Todo> todo = todoRepository.findById(String.valueOf(id));
        return todo; // No need to call get() here
    }

    @Override
    public void insert(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void update(Long id, Todo todo) {
        Optional<Todo> todoBd = todoRepository.findById(String.valueOf(id));
        if (todoBd.isPresent()) {
            todoRepository.save(todo);
        }
    }

    @Override
    public void delete(Long id) {
        // Deletar Todo por ID.
        todoRepository.deleteById(String.valueOf(id));
    }
}