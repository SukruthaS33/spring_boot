package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//prototype = lazy+prototype
public class ClassN {

	public ClassN() {
		System.out.println("Hi I am classN");
	}

	public void callClassN() {
		System.out.println("class N is being  called "+this.hashCode());
	}
	
	public void callClassN2() {
		System.out.println("class N is being  called again "+this.hashCode());
		
	}
	
	public void callClassN3() {
		System.out.println("class N is being  called again "+this.hashCode());
		
	}
}
