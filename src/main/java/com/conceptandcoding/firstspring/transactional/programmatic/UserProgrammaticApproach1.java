package com.conceptandcoding.firstspring.transactional.programmatic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import jakarta.annotation.PostConstruct;

@Component
public class UserProgrammaticApproach1 {

	PlatformTransactionManager userTransactionManager;

	// @Autowired is not required here
	UserProgrammaticApproach1(PlatformTransactionManager userTransactionManager) {
		this.userTransactionManager = userTransactionManager;
	}

	@PostConstruct
	public void pC() {
		System.out.println("postconstuct of UserProgrammaticApproach1");
		System.out.println(userTransactionManager);
	}

	public void updateUserProgrammatic() {
		TransactionStatus status = userTransactionManager.getTransaction(null);

		try {
			System.out.println("Insert query run1");
			System.out.println("Update query run1");
			userTransactionManager.commit(status);
		}

		catch (Exception e) {
			userTransactionManager.rollback(status);
		}
	}

}
