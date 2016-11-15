package org.bukharov.procurementDepartment.logic.usecases;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class PublicationOfficeRegistrationUseCaseTest {
	
	@Autowired
	PublicationOfficeRegistration useCase;
	
	@Test
	public void executeTest(){
		String name = "test name",
				location = "test location",
				description = "test description";
		useCase.execute(name, location, description);
	}
}
