package com.conceptandcoding.firstspring.transactional;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.client.RestTemplate;

import jakarta.persistence.EntityManager;

@Service
public class TransactionalService {

	TransactionDAOObject daoObj;

	EntityManager entityManager;

	DataSource dataSource; // Inject the DataSource

	@Autowired
	public TransactionalService(TransactionDAOObject daoObj, EntityManager entityManagerm, DataSource dataSource) {
		this.daoObj = daoObj;
		this.entityManager = entityManager;
		this.dataSource = dataSource;
	}

	@Transactional
	public boolean transactionalServiceMethod() {

		boolean dbinvocationStatus = false;
		try {
			if (!dbinvocationStatus) {
				throw new RuntimeException();
			}
		} catch (Exception e) {
			throw e;
		}
		System.out.println("continue the program");

		return dbinvocationStatus;

	}

	@Transactional
	public boolean transactionalServiceMethod1() {

		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		boolean dbinvocationStatus = false;
		try {

			daoObj.TransactionDAOObjectMethod1();
		} catch (Exception e) {
			throw e;
		}

		return dbinvocationStatus;

	}

	@Transactional
	public boolean transactionalServiceMethod2() {

		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod2();
		return false;
	}

	// @Transactional
	public boolean transactionalServiceMethod3() {

		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod3();
		return false;

	}

	@Transactional
	public boolean transactionalServiceMethod4() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod4();
		return false;
	}

	@Transactional
	public boolean transactionalServiceMethod5() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod5();
		return false;
	}

	@Transactional
	public boolean transactionalServiceMethod6() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod6();
		return false;
	}

	// here we are not using hibernate we are simply connecting directly using
	// DataSource
	// this is to test the cons of using delcarative approach for @Transactional AOP
	@Transactional
	public boolean checkConnection() {
		try (Connection connection = dataSource.getConnection()) { // Get connection from DataSource
			// Print connection details (for diagnostic purposes)
			System.out.println("Current Connection: " + connection);
			System.out.println("Connection URL: " + connection.getMetaData().getURL());
			System.out.println("Connection User: " + connection.getMetaData().getUserName());
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	public boolean checkConnectionWithExternalApi(String userName) {
		
		try (Connection connection = dataSource.getConnection()) { // Get connection from DataSource
			// Print connection details (for diagnostic purposes)
			System.out.println("Current Connection: for " + userName);
			System.out.println("Current Connection: " + connection);
			System.out.println("Connection URL: " + connection.getMetaData().getURL());
			System.out.println("Connection User: " + connection.getMetaData().getUserName());
			
			RestTemplate restTemplate = new RestTemplate();

			// URL of the JSONPlaceholder API endpoint
			String url = "https://jsonplaceholder.typicode.com/posts";

			// Make a GET request and print the result
			String result = restTemplate.getForObject(url, String.class);
			System.out.println(result);
			return true;
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
