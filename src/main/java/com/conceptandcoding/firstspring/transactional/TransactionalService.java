package com.conceptandcoding.firstspring.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class TransactionalService {

	TransactionDAOObject daoObj;

	@Autowired
	public TransactionalService(TransactionDAOObject daoObj) {
		this.daoObj = daoObj;
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

	//@Transactional
	public boolean transactionalServiceMethod3() {
	
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod3();
		return false;
	}

	public boolean transactionalServiceMethod4() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod4();
		return false;
	}

	public boolean transactionalServiceMethod5() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod5();
		return false;
	}

	public boolean transactionalServiceMethod6() {
		System.out.println("is transaction active " + TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("Current transaction name " + TransactionSynchronizationManager.getCurrentTransactionName());
		daoObj.TransactionDAOObjectMethod6();
		return false;
	}

}
