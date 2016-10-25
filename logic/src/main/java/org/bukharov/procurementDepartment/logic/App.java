package org.bukharov.procurementDepartment.logic;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
  public static void main( String[] args )
  {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:spring-logic-config.xml");
    ctx.refresh();
    System.out.println("printAll: ");

    ContactService service = ctx.getBean("jpaContactService", ContactService.class);
    List<Contact> contacts = service.findAll();
    printAll(contacts);

    contacts = service.findByFirstName("ivan");
    printAll(contacts);

    contacts = service.findByFirstNameAndLastName("ivan", "pavlov");
    printAll(contacts);
  }
  
  private static void printAll(List<Contact> contacts) {
    System.out.println("printAll: ");
    for (Contact contact : contacts) {
        System.out.println(contact);
    }
  }
}
