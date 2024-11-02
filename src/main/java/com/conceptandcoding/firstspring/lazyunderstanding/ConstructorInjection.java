package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
	
	@Lazy
	@Qualifier("Offlineorder")
	@Autowired
	public Order order;

	public Invoice invoice;

	 // not at all required
//	@Autowired
//	public ConstructorInjection(Order order, Invoice invoice) {
//		this.order = order;
//		this.invoice = invoice;
////		System.out.println(order);
////		System.out.println(invoice);
//	}

}
