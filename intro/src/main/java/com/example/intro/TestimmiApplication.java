package com.example.testimmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class TestimmiApplication {
	ArrayList<String> todos = new ArrayList<String>();


	public static void main(String[] args) {
		SpringApplication.run(TestimmiApplication.class, args);

	}



		@RequestMapping("/")
		String greeting() {
				return "Hallo Welt!";
		}

		@GetMapping("/todos/default")
		public ArrayList<String> getAll(){
			todos.clear();
			todos.add("eat");
			todos.add("sleep");
			todos.add("rave");
			return todos;
	}

	@GetMapping("/todos")
	public ArrayList<String> getDos(){
		return todos;
}
  	@PostMapping("/todos/{todo}")
    public String add(@PathVariable String todo){

	  		todos.add(todo);
	   		return "added "+todo;
   }



}
