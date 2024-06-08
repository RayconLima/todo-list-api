package com.example.todolist_solid.Services.impl;

import com.example.todolist_solid.Services.TodoService;
import com.example.todolist_solid.models.Todo;
import com.example.todolist_solid.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAll()
    {
        // Buscar todos os Todos.
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public Optional<Todo> getById(Long id) {
        return todoRepository.findById(String.valueOf(id));
    }

    @Override
    public Optional<Object> getTaskById(Long id) {
        Optional<Todo> todoOptional = todoRepository.findById(String.valueOf(id));

        if (todoOptional.isPresent()) {
            Todo todo = todoOptional.get();
            return Optional.ofNullable(todo.getTasks());
        } else {
            return Optional.empty();
        }
    }

    @Override
    public List<Todo> insert(Todo todo) {
        todoRepository.save(todo);
        return getAll();
    }

    @Override
    public List<Todo> update(Long id, Todo todo) {
        Optional<Todo> todoBd = todoRepository.findById(String.valueOf(id));
        if (todoBd.isPresent()) {
            todoRepository.save(todo);
        }

        return getAll();
    }

    @Override
    public List<Todo> delete(Long id) {
        // Deletar Todo por ID.
        todoRepository.deleteById(String.valueOf(id));
        return getAll();
    }
}