package org.bukharov.procurementDepartment.logic.usecases;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")

public class AuthorRegistrationUseCaseTest {
	
	@Autowired
	AuthorRegistration useCase;
	
	@Test	
	public void executeTest(){
		String name = "test name",
				surname = "test surname",
				lastname = "test lastname",
				biography = "test biography";
		int birthYear = 2015;
		useCase.execute(name, surname, lastname, biography, birthYear);
	}
}
