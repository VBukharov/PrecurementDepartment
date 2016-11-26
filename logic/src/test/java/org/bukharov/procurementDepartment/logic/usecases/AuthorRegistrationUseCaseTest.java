package org.bukharov.procurementDepartment.logic.usecases;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.logic.dto.input.InputAuthorBODTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class AuthorRegistrationUseCaseTest {
	
	@Autowired
	AuthorRegistration<InputAuthorBODTO> useCase;
	
	@Test	
	public void executeTest(){
		String name = "test name",
				surname = "test surname",
				lastname = "test lastname",
				biography = "test biography";
		
		InputAuthorBODTO inputDto = new InputAuthorBODTO(name, surname, lastname, biography);
		useCase.execute(inputDto);
	}
}
