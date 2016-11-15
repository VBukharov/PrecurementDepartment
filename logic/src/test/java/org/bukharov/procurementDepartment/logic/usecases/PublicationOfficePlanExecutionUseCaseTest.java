package org.bukharov.procurementDepartment.logic.usecases;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeExecutionPlanDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class PublicationOfficePlanExecutionUseCaseTest {

	@Autowired
	PublicationOfficePlanExecution useCase;
	
	private List<PublicationOfficeExecutionPlanDTO> dtoList;
	
	@Before
	public List<PublicationOfficeExecutionPlanDTO> initVariables(){
		for(int i = 0; i < 9; i++){

		}
		return null;
	}
	
	@Test
	public void executeTest(){
//		useCase.execute(publicationOfficeId, dtoList);
	}
}
