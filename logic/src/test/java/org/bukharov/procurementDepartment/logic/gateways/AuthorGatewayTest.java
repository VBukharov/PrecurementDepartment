package org.bukharov.procurementDepartment.logic.gateways;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class AuthorGatewayTest {

	@Autowired
	AuthorGateway gateway;

	@Autowired
	AuthorService service;

	private Author author;

	private AuthorBO authorBO;

	private Author getAuthor() {
		return new Author(Double.toString(Math.random() * 100), Double.toString(Math.random() * 100),
				Double.toString(Math.random() * 100), Double.toString(Math.random() * 100));
	}

	private boolean isObjetsEqual(Author author, AuthorBO authorBO) {
		return author.getName().equals(authorBO.getName()) && author.getBiography().equals(authorBO.getBiography())
				&& author.getSecondName().equals(authorBO.getSecondName())
				&& author.getSurname().equals(authorBO.getSurname());
	}

	private boolean isListsEqual(List<Author> authorList, List<AuthorBO> authorBOList) {
		boolean result = true;
		for (int i = 0; i < authorList.size(); i++) {
			result |= isObjetsEqual(authorList.get(i), authorBOList.get(i));
		}
		return result;
	}

	private List<Author> createAuthors() {
		for (int i = 0; i < 10; i++) {
			service.save(getAuthor());
		}
		return service.findAll();
	}

	@Test
	public void findByIdTest() {
		author = service.save(getAuthor());
		authorBO = gateway.findById(author.getId());
		assertTrue(isObjetsEqual(author, authorBO));
	}

	@Test
	public void findAllEqualLengthTest() {
		List<Author> authorList = service.findAll();
		if (authorList != null && authorList.isEmpty())
			authorList = createAuthors();

		List<AuthorBO> authorBOList = gateway.findAll();
		assertEquals(authorList.size(), authorBOList.size());

	}

	@Test
	public void findAllEqualObjectsTest() {

		List<Author> authorList = service.findAll();
		if (authorList != null && authorList.isEmpty())
			authorList = createAuthors();

		List<AuthorBO> authorBOList = gateway.findAll();
		assertTrue(isListsEqual(authorList, authorBOList));
	}

	@Test
	public void createTest() {
		author = service.save(getAuthor());
		authorBO = gateway.findById(author.getId());
		assertTrue(isObjetsEqual(author, authorBO));
	}

	@Test
	public void deleteTest() {
		int id = service.save(getAuthor()).getId();
		gateway.delete(id);
		assertEquals(null, gateway.findById(id));
	}

	@Test
	public void updateTest() {
		
		author = service.save(getAuthor());
		authorBO = gateway.findById(author.getId());
		gateway.update(author.getId());
		assertTrue(isObjetsEqual(author, authorBO));
	}
}
