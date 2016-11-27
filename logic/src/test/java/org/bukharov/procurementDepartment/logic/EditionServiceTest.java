package org.bukharov.procurementDepartment.logic;

import static org.junit.Assert.assertEquals;

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

  private Edition createEdition(){
    String name = "testValue";
    int year = 2016;
    int quantityOfPapers = 500;
    int quantity = 100;
    String annotation = "testValue";
    String valueToSearch = "new test value";
    publicationOfficeService.save(publicationOffice);
    authorService.save(author);
    Edition edition = new Edition(name, year, quantityOfPapers, quantity, annotation,
        publicationOffice, author);
    return edition;
  }
  
  @Before
  public void initTestVariables() {
    int id = 5;
    String name = "testValue";
    String location = "testValue";
    String description = "testValue";
    publicationOffice = new PublicationOffice(name, location, description);

    String authorName = "testValude";
    String surname = "testValue";
    String secondName = "testValue";
    String biography = "testValue";
    author = new Author(authorName, surname, secondName, biography);
    authorSet = new HashSet();
    authorSet.add(author);
  }

  @Test
  public void testCreateEdition() {
    Edition edition = createEdition();
    Edition result = service.save(edition);
    assertEquals(edition, result);
  }

  @Test
  public void testUpdateEdition() {
    String valueToSearch = "new test value";
    Edition edition = createEdition();
    Edition result = service.save(edition);
    result.setName(valueToSearch);
    Edition toCompare = service.findByName(valueToSearch).get(0);
    assertEquals(toCompare, result);
  }

  @Test
  public void testDeleteEdition() {
    Edition edition = createEdition();
    String testName = edition.getName();
    int testYear = edition.getYear();
    int beforeSize = service.findByNameAndYear(testName, testYear).size();
    service.save(edition);
    service.delete(edition);
    assertEquals(beforeSize,service.findByNameAndYear(testName, testYear).size());
  }

  @Test
  public void testGetAllEditions() {
     int addition = 5;
     String testName = "testValue";
     int beforeSize = service.findAll().size() + addition;
     Edition edition = createEdition();
     for(int i = 0; i < addition; i++){
       edition.setId(i+10);
       edition.setName(testName + i);
       service.save(edition);
     }
     int afterSize = service.findAll().size();
     assertEquals(beforeSize, afterSize);
  }
  
}
