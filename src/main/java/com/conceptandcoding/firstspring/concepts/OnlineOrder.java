package com.conceptandcoding.firstspring.concepts;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OnlineOrder implements Order {
	


	public OnlineOrder() {
		System.out.println("Online order initialised ");
	}
	
	
}
