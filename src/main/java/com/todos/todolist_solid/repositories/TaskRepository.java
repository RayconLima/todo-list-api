package com.todos.todolist_solid.repositories;

import com.todos.todolist_solid.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {
    //
}
