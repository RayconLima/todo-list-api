package com.todos.todolist_solid.repositories;

import com.todos.todolist_solid.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, String> {
    //
}
