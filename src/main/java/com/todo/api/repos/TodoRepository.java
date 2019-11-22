package com.todo.api.repos;

import com.todo.api.entities.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;

import java.util.stream.Stream;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}
