package org.bukharov.procurementDepartment.logic;

import static org.junit.Assert.*;

import org.bukharov.procurementDepartment.model.service.ContactService;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
public class JUnitTest extends TestCase {

	@Autowired
	private PublicationOfficeService service;

	@Test
	public void testSampleService() {
//		assertEquals(null, this.service.findAll());

	}

}
