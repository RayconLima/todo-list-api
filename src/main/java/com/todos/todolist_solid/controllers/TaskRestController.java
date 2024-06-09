package com.todos.todolist_solid.controllers;

import com.todos.todolist_solid.Services.TaskService;
import com.todos.todolist_solid.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/tasks")
public class TaskRestController {
    @Autowired
    private TaskService taskService;

    @GetMapping()
    public ResponseEntity<Iterable<Task>> findAll()
    {
        return ResponseEntity.ok(taskService.getAll());
    }

    @GetMapping("/{id}")
    public Optional<Task> findById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getById(id)).getBody();
    }

    @PostMapping()
    public ResponseEntity<Task> store(@RequestBody Task todo) {
        taskService.insert(todo);
        return ResponseEntity.ok(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody Task todo) {
        taskService.update(id, todo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> destroy(@PathVariable Long id) {
        taskService.delete(id);
        return ResponseEntity.ok().build();
    }
}
