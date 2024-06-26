package com.todos.todolist.controllers;

import com.todos.todolist.Services.TodoService;
import com.todos.todolist.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/todos")
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @GetMapping()
    public ResponseEntity<Iterable<Todo>> findAll()
    {
        return ResponseEntity.ok(todoService.getAll());
    }

    @GetMapping("/{id}")
    public Optional<Todo> findById(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.getById(id)).getBody();
    }

    @GetMapping("/{id}/tasks")
    public Optional<Object> getTasksById(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.getTaskById(id)).getBody();
    }

    @PostMapping()
    public ResponseEntity<Todo> store(@RequestBody Todo todo) {
        todoService.insert(todo);
        return ResponseEntity.ok(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        todoService.update(id, todo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> destroy(@PathVariable Long id) {
        todoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
