package com.todos.todolist.repositories;

import com.todos.todolist.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {
    //
}
