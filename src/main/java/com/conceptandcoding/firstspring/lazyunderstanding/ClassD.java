package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassD {

//	@Autowired
//	ClassC classC;
	@Lazy
	@Autowired
	public ClassD(ClassC classC) {
		System.out.println("Class D constructed");
	}

}
