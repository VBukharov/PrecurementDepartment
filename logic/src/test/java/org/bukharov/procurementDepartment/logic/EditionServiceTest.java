package org.bukharov.procurementDepartment.logic;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.AuthorService;
import org.bukharov.procurementDepartment.model.service.EditionService;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class EditionServiceTest {

	@Autowired
	EditionService service;

	@Autowired
	PublicationOfficeService publicationOfficeService;

	@Autowired
	AuthorService authorService;

	private PublicationOffice publicationOffice;

	private Author author;

	private Set<Author> authorSet;

	@Before
	public void initTestVariables() {
		String name = "testValue";
		String location = "testValue";
		String description = "testValue";
		publicationOffice = new PublicationOffice(name, location, description);

		String authorName = "testValude";
		String surname = "testValue";
		String secondName = "testValue";
		String biography = "testValue";
		author = new Author(authorName, surname, secondName, biography);
		authorSet = new HashSet<>();
		authorSet.add(author);
	}

	@Test
	@Ignore
	public void testCreateEdition() {
		String name = "testValue";
		int year = 2016;
		int quantityOfPapers = 500;
		int quantity = 100;
		String annotation = "testValue";

		publicationOfficeService.save(publicationOffice);
		authorService.save(author);
		Edition edition = new Edition(name, year, quantityOfPapers, quantity, annotation, publicationOffice,
				author);
		Edition result = service.save(edition);
		assertEquals(edition, result);
	}

	@Test
	public void testUpdateEdition() {
		String name = "testValue";
		int year = 2016;
		int quantityOfPapers = 500;
		int quantity = 100;
		String annotation = "testValue";
		String valueToSearch = "new test value";
		publicationOfficeService.save(publicationOffice);
		authorService.save(author);
		Edition edition = new Edition(name, year, quantityOfPapers, quantity, annotation, publicationOffice,
				author);
		Edition result = service.save(edition);
		result.setName(valueToSearch);
		Edition toCompare = service.findByName(valueToSearch).get(0);
		assertEquals(toCompare, result);
	}

	@Test
	public void testDeleteEdition() {
		String name = "testValue";
		String surname = "testValue";
		String secondName = "testValue";
		// String biography = "testValue";
		// int beforeSize = service.findByNameAndSurnameAndSecondName(name,
		// surname, secondName).size();
		// Edition edition = new Edition(5, name, surname, secondName,
		// biography);
		// service.save(edition);
		// service.delete(edition);
		// assertEquals(beforeSize,
		// service.findByNameAndSurnameAndSecondName(name, surname,
		// secondName).size());
	}

	@Test
	public void testGetAllEditions() {
		int beforeSize = service.findAll().size();
		// int addition = 5;
		// for(int i = 0; i < addition; i++){
		// service.save(new Edition(i+10, "testValue"+i, "testValue"+i,
		// "testValue"+i, "testValue"+i));
		// }
		// int afterSize = service.findAll().size();
		// assertEquals(beforeSize + addition, afterSize);
	}
}
