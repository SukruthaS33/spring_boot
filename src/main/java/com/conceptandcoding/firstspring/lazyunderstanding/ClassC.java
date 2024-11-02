package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassC {
	
	

	
	@Autowired
	public ClassC(ClassD classD) {
		System.out.println("Class C constructed");
	}
	

}
