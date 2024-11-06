package com.conceptandcoding.firstspring.beanscopes.chatgpt;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Task {
	
	private final String taskId;

	public Task() {

		System.out.println("Hi I am Task");
		this.taskId = UUID.randomUUID().toString();
		
        System.out.println("Task created with ID: " + taskId);

	}

	@PostConstruct
	public void pstC() {
		System.out.println(this.hashCode());
	}
	
	 public String getTaskId() {
	        return taskId;
	    }
}
