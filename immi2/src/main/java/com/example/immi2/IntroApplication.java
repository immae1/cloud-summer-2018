package com.example.immi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class IntroApplication {
	interface ToDoRepository extends CrudRepository<ToDo, Long> {

	}
	ArrayList<String> todos = new ArrayList<String>();
	@Autowired
	ToDoRepository toDoRepository;

	@GetMapping("/todos")
	public ArrayList<String> getAll(){

		return todos;
	}

	@GetMapping("/readAll")
	String readAll(){

		return toDoRepository.findAll().toString();

	}

	@PostMapping("/add/{todo}")
	String create(@PathVariable String todo){

		toDoRepository.save(new ToDo(todo));
		return "Added: "+todo;

	}

	@PostMapping("/todos/{todo}")
	public String add(@PathVariable String todo){

		todos.add(todo);
		return "added "+todo;
	}

	@DeleteMapping("/todos/{todo}")
	public String remove(@PathVariable String todo){

		todos.remove(todo);
		return "remove "+todo;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroApplication.class, args);
	}
}
