package org.bukharov.procurementDepartment.logic;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.AuthorService;
import org.bukharov.procurementDepartment.model.service.EditionService;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class EditionServiceTest {
  
  // TODO 
  /*
   * Добавить создание временных издательств и авторов для теста
   * с аннотациями @Before и @After
   */
  
  @Autowired
  EditionService service;
  
  @Autowired
  PublicationOfficeService publicationOfficeService;
  
  @Autowired
  AuthorService authorService;

  @Test
  public void testCreateEdition(){
    int id = 5;
    String name = "testValue";
    int year = 2016;
    int quantityOfPapers = 500;
    int quantity = 100;
    PublicationOffice publicationOffice = null;
    String annotation = "testValue";
    Edition edition = new Edition(id, name, year, quantityOfPapers, quantity, annotation, publicationOffice);
    Edition result = service.save(edition);
    assertEquals(edition, result);
  }

  @Test
  public void testUpdateEdition(){
    int id = 5;
    String name = "testValue";
    int year = 2016;
    int quantityOfPapers = 500;
    int quantity = 100;
    PublicationOffice publicationOffice = null;
    String annotation = "testValue";
//    Edition edition = new Edition(id, name, year, quantityOfPapers, quantity, annotation, publicationOffice);
//    service.save(edition);
//    Edition result = service.findByName(name).get(0);
//    result.setName("new value");
//    result.setSecondName("new value");
//    result.setSurname("new value");
//    Edition toCompare = service.findByNameAndSurnameAndSecondName("new value", "new value", "new value").get(0);
//    assertEquals(toCompare, result);
  }
  
  @Test
  public void testDeleteEdition(){
    String name = "testValue";
    String surname = "testValue";
    String secondName = "testValue";
//    String biography = "testValue";
//    int beforeSize = service.findByNameAndSurnameAndSecondName(name, surname, secondName).size();
//    Edition edition = new Edition(5, name, surname, secondName, biography);
//    service.save(edition);
//    service.delete(edition);
//    assertEquals(beforeSize, service.findByNameAndSurnameAndSecondName(name, surname, secondName).size());
  }

  @Test
  public void testGetAllEditions(){
    int beforeSize = service.findAll().size();
//    int addition = 5;
//    for(int i = 0; i < addition; i++){
//      service.save(new Edition(i+10, "testValue"+i, "testValue"+i, "testValue"+i, "testValue"+i));
//    }
//    int afterSize = service.findAll().size();
//    assertEquals(beforeSize + addition, afterSize);
  }
}
