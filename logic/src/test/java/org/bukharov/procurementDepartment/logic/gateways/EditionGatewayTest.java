package org.bukharov.procurementDepartment.logic.gateways;

import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;
import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.EditionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class EditionGatewayTest {
	
	@Autowired
	EditionGateway gateway;
	
	@Autowired
	EditionService service;
	
	@Autowired
	AuthorGateway authorGateway;
	
	@Autowired
	PublicationOfficeGateway publicationOfficeGateway;
	
	private Edition edition;
	
	private EditionBO editionBO;
	
	private Author getAuthor() {
		return new Author(Double.toString(Math.random() * 100), Double.toString(Math.random() * 100),
				Double.toString(Math.random() * 100), Double.toString(Math.random() * 100));
	}
	
	private PublicationOffice getPublicationOffice() {
		return new PublicationOffice(Double.toString(Math.random() * 100), Double.toString(Math.random() * 100),
				Double.toString(Math.random() * 100));
	}
	
	private Edition getEdition(){
		return new Edition(Double.toString(Math.random()), (int)(Math.random()*1000), (int)(Math.random()*1000), (int)(Math.random()*1000), Double.toString(Math.random()), getPublicationOffice(), getAuthor());
	}
	
	private boolean isAuthorsEqual(Author author, AuthorBO authorBO) {
		return author.getName().equals(authorBO.getName()) && author.getBiography().equals(authorBO.getBiography())
				&& author.getSecondName().equals(authorBO.getSecondName())
				&& author.getSurname().equals(authorBO.getSurname());
	}
	
	private boolean isPublicationOfficesEquals(PublicationOffice office, PublicationOfficeBO officeBO) {
		return office.getName().equals(officeBO.getName()) && office.getLocation().equals(officeBO.getLocation())
				&& office.getDescription().equals(officeBO.getDescription());
	}
	
	private boolean isEditionsEquals(Edition edition, EditionBO editionBO){
		return edition.getName().equals(editionBO.getName())
				&& edition.getYear() == editionBO.getYear()
				&& edition.getQuantity() == edition.getQuantity()
				&& edition.getQuantityOfPapers() == editionBO.getQuantityOfPapers()
				&& isAuthorsEqual(edition.getAuthor(), editionBO.getAuthor())
				&& isPublicationOfficesEquals(edition.getPublicationOffice(), editionBO.getPublicationOffice());
	}
	
	private boolean isListEquals(List<Edition> editions, List<EditionBO> editionBOs){
		boolean result = true;
		for(int i = 0; i < editions.size(); i++){
			result |= isEditionsEquals(editions.get(i), editionBOs.get(i));
		}
		return result;
	}
	
	private List<Edition> createEditions(){
		for(int i = 0; i < 10; i++)
			service.save(getEdition());
		return service.findAll();
	}
	
	@Test
	public void findByIdTest(){
		edition = service.save(getEdition());
		editionBO = gateway.findById(edition.getId());
		assertTrue(isEditionsEquals(edition, editionBO));
	}
	
	@Test
	public void findAllEqualsLengthTest(){
		List<Edition> editions = service.findAll();
		if(editions == null)
			editions = createEditions();
		List<EditionBO> editionBOs = gateway.findAll();
		assertEquals(editions.size(), editionBOs.size());
	}
	
	@Test
	public void findAllEqualsObjectsTest(){
		List<Edition> editions = service.findAll();
		if(editions == null)
			editions = createEditions();
		List<EditionBO> editionBOs = gateway.findAll();
		assertTrue(isListEquals(editions, editionBOs));
	}
	
	@Test
	public void createTest(){
		edition = service.save(getEdition());
		editionBO = gateway.findById(edition.getId());
		assertTrue(isEditionsEquals(edition, editionBO));
	}
	
	@Test
	public void deleteTest(){
		int id = service.save(getEdition()).getId();
		editionBO = gateway.findById(id);
		gateway.delete(id);
		assertEquals(null, gateway.findById(id));
	}
	
	@Test
	public void updateTest(){
		Edition edition = service.save(getEdition());
		editionBO = gateway.findById(edition.getId());
		gateway.update(edition.getId());
		assertTrue(isEditionsEquals(edition, editionBO));
	}
}
