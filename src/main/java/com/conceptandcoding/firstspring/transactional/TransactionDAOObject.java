package com.conceptandcoding.firstspring.transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Repository
public class TransactionDAOObject {
	//if parent transaction is active don't create another one
	@Transactional(propagation = Propagation.REQUIRED)
	public void TransactionDAOObjectMethod1() {

		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.REQURIED is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.REQUIRED : Current transaction name " + currentTransactionName);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void TransactionDAOObjectMethod2() {

		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.REQURIES_NEW is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.REQUIRES_NEW : Current transaction name " + currentTransactionName);
	}
	
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void TransactionDAOObjectMethod3() {

		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.SUPPORTS is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.SUPPORTS : Current transaction name " + currentTransactionName);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void TransactionDAOObjectMethod4() {
		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.SUPPORTS is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.SUPPORTS : Current transaction name " + currentTransactionName);
		
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void TransactionDAOObjectMethod5() {
		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.SUPPORTS is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.SUPPORTS : Current transaction name " + currentTransactionName);
		
	}

	@Transactional(propagation = Propagation.NEVER)
	public void TransactionDAOObjectMethod6() {
		boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
		String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
		System.out.println("Propagation.SUPPORTS is parent transaction active" + isTransactionActive);
		System.out.println("Propagation.SUPPORTS : Current transaction name " + currentTransactionName);
		
	}
	
	
}
