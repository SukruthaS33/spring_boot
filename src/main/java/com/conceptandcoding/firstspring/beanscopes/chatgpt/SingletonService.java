package com.conceptandcoding.firstspring.beanscopes.chatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class SingletonService {

	@Autowired
	Task task;

	public SingletonService() {
		System.out.println("Hi I am SingletonService");
	}

	@PostConstruct
	public void printTaskId() {
		System.out.println(task.getTaskId());
		System.out.println(task.hashCode());
	}

}
