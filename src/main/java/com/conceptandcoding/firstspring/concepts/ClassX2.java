package com.conceptandcoding.firstspring.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("classX2 object")
@Component
public class ClassX2 implements ClassX{

	

	public ClassX2() {
		System.out.println("ClassX2 initialized");
	}

	

	public void order() {
		System.out.println("classX2 order placed");
	}

}
