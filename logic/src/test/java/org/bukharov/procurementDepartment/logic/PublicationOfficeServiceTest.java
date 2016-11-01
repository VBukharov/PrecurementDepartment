/**
 * 
 */
package org.bukharov.procurementDepartment.logic;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author bukharov
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-logic-config.xml")
@Transactional
public class PublicationOfficeServiceTest {
  
  @Autowired
  PublicationOfficeService service;
  
  @Test
  public void testCreatePublicationOffice(){
    PublicationOffice publicationOffice = new PublicationOffice(5, "testValue", "testValue", "testValue");
    PublicationOffice result = service.save(publicationOffice);
    assertEquals(publicationOffice, result);
  }

  @Test
  public void testUpdatePublicationOffice(){
    PublicationOffice publicationOffice = new PublicationOffice(5, "testValue", "testValue", "testValue");
    service.save(publicationOffice);
    PublicationOffice result = service.findByNameAndLocation("testValue", "testValue");
    result.setName("new name");
    result.setLocation("new location");
    PublicationOffice toCompare = service.findByNameAndLocation("new name", "new location");
    assertEquals(toCompare, result);
  }
  
  @Test
  public void testDeletePublicationOffice(){
    PublicationOffice publicationOffice = new PublicationOffice(5, "testValue", "testValue", "testValue");
    PublicationOffice result = service.save(publicationOffice);
    service.delete(publicationOffice);
    assertEquals(null, service.findByNameAndLocation("testValue", "testValue"));
  }

  @Test(expected=DataIntegrityViolationException.class)
  public void testUniqueNameAndLocation(){
    PublicationOffice publicationOffice1 = new PublicationOffice(5, "name 1", "location 1", "testValue 1");
    PublicationOffice publicationOffice2 = new PublicationOffice(6, "name 1", "location 1", "testValue 2");
    service.save(publicationOffice1);
    service.save(publicationOffice2);
    PublicationOffice result = service.findByNameAndLocation("name 1", "description 1");
  }

  @Test
  public void testGetAllPublicationOffice(){
    int beforeSize = service.findAll().size();
    int addition = 5;
    for(int i = 0; i < addition; i++){
      service.save(new PublicationOffice(i+10, "testValue"+i, "testValue"+i, "testValue"+i));
    }
    int afterSize = service.findAll().size();
    assertEquals(beforeSize + addition, afterSize);
  }
  
  @Test
  //TODO Получение всех изданий издательства
  public void testGetAllPublications(){
    
  }
  
  @Test
  //TODO Создание издания с существующим названием и местоположением
  public void testCreateEditionWithExistingNameAndLocation(){
    
  }
}
