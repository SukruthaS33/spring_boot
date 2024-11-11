package com.conceptandcoding.firstspring.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionalService {

	@Transactional
	public boolean transactionalServiceMethod() {
		System.out.println("inside the transactional service");
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

}
