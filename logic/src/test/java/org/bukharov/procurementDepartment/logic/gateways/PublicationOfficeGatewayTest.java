package org.bukharov.procurementDepartment.logic.gateways;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class PublicationOfficeGatewayTest {

	@Autowired
	PublicationOfficeGateway gateway;

	@Autowired
	PublicationOfficeService service;

	private PublicationOffice office;

	private PublicationOfficeBO officeBO;

	private PublicationOffice getPublicationOffice() {
		return new PublicationOffice(Double.toString(Math.random() * 100), Double.toString(Math.random() * 100),
				Double.toString(Math.random() * 100));
	}

	private boolean isObjectEquals(PublicationOffice office, PublicationOfficeBO officeBO) {
		return office.getName().equals(officeBO.getName()) && office.getLocation().equals(officeBO.getLocation())
				&& office.getDescription().equals(officeBO.getDescription());
	}

	private boolean isListEquals(List<PublicationOffice> offices, List<PublicationOfficeBO> officeBOs) {
		boolean result = true;
		for (int i = 0; i < offices.size(); i++) {
			result |= isObjectEquals(offices.get(i), officeBOs.get(i));
		}
		return result;
	}

	private List<PublicationOffice> createPublicationOffices() {
		for (int i = 0; i < 10; i++) {
			service.save(getPublicationOffice());
		}
		return service.findAll();
	}

	@Test
	public void findByIdTest() {
		office = service.save(getPublicationOffice());
		officeBO = gateway.findById(office.getId());
		assertTrue(isObjectEquals(office, officeBO));
	}

	@Test
	public void findAllEqualsLengthTest() {
		List<PublicationOffice> offices = service.findAll();
		if (offices == null)
			offices = createPublicationOffices();
		List<PublicationOfficeBO> officeBOs = gateway.findAll();
		assertEquals(offices.size(), officeBOs.size());;		
	}
	
	@Test
	public void findAllEqualsObjectTest(){
		List<PublicationOffice> offices = service.findAll();
		if (offices == null)
			offices = createPublicationOffices();
		List<PublicationOfficeBO> officeBOs = gateway.findAll();
		assertTrue(isListEquals(offices, officeBOs));
	}
	
	@Test
	public void createTest(){
		office = service.save(getPublicationOffice());
		officeBO = gateway.findById(office.getId());
		assertTrue(isObjectEquals(office, officeBO));
	}
	
	@Test
	public void deleteTest(){
		office = service.save(getPublicationOffice());
		officeBO = gateway.findById(office.getId());
		gateway.delete(office.getId());
		assertEquals(null, gateway.findById(office.getId()));
	}
	
	@Test
	public void updateTest(){
		office = service.save(getPublicationOffice());
		officeBO = gateway.findById(office.getId());
		gateway.update(office.getId());
		assertTrue(isObjectEquals(office, officeBO));
	}
}
