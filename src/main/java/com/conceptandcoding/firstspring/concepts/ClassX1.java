package com.conceptandcoding.firstspring.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("classX1 object")
@Component
public class ClassX1 implements ClassX {

	public ClassX1() {
		System.out.println("ClassX1 initialized");
	}
	

	public void order() {
		System.out.println("ClassX1 order placed");
	}
	


}
