package com.conceptandcoding.firstspring.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Offlineorder")

@Component
public class OfflineOrder implements Order {
	
	

}
