package com.conceptandcoding.firstspring;

import javax.sql.DataSource;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

//import com.chatgpt.servlets.MyServlet;

//import com.conceptandcoding.firstspring.concepts.ClassA;
//import com.conceptandcoding.firstspring.concepts.OnlineOrder;
@Configuration
public class AppConfig {

//	@Bean
//	ClassA createClassABean() {// public is not required here as an AM
//		System.out.println("creating class A bean");
//		return new ClassA("Hi ClassA");
//
//	}
//
//	@Primary
//	@Bean
//	OnlineOrder createClassOnlineOrder() {// public is not required here as an AM
//		System.out.println("creating class online order bean");
//		return new OnlineOrder();
//
//	}

	@Bean
	 DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_boot");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean 
	PlatformTransactionManager userTransactionManager(DataSource dataSource) {
		
		return new DataSourceTransactionManager(dataSource);
	}

}
