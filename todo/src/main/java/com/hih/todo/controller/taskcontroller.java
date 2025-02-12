package com.hih.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hih.todo.model.task;
import com.hih.todo.repository.TaskRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class taskcontroller {
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/hello-world")
	public String hiiworld() {
		return "hellooooo"; 
	}
	
	@PostMapping
	public task createtask(@RequestBody task task) {
		taskRepository.save(task)  ;
		return task;
		
	}
	@GetMapping
	public List<task> getAllTasks() {
		return taskRepository.findAll();
	}
	@PutMapping("/{id}")
	public task UpdateTask(@PathVariable Long id, @RequestBody task task) {
		task.setId(id);
		return taskRepository.save(task);
	}
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskRepository.deleteById(id);
	}

}
