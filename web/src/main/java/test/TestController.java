package test;

import java.util.List;


import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
  
  @Autowired
  ContactService cs;
  
  @SuppressWarnings("rawtypes")
  @RequestMapping(value="/contacts")
  public ResponseEntity<List> getAll(){
    System.out.println("before query");
    List<Contact> contacts = cs.findAll();
    System.out.println("after query " + contacts.get(0).getFirstName());   
    return new ResponseEntity<List>(contacts, HttpStatus.OK);
  }

  @SuppressWarnings("rawtypes")
  @RequestMapping(value="/contact/{firstName}")
  public ResponseEntity<List> getById(@PathVariable("firstName") String firstName){
    return new ResponseEntity<List>(cs.findByFirstName(firstName), HttpStatus.OK);
  }
}
