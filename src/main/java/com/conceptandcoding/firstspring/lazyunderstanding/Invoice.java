package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.stereotype.Component;

@Component
public class Invoice {

	public Invoice() {
		System.out.println("invoice created");
	}
}
