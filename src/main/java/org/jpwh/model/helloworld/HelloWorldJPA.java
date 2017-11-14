package org.jpwh.model.helloworld;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HelloWorldJPA {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");
	
}
