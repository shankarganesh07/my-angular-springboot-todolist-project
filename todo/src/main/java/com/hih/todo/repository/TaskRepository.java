package com.hih.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hih.todo.model.task;

public interface TaskRepository extends JpaRepository<task, Long> {
	

}
