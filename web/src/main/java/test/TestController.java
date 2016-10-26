package test;

import java.util.List;


import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
  
  @Autowired
  ContactService cs;
  
  @RequestMapping(value="/get", method = RequestMethod.GET)
  public String getAll(Model model){
    
    List<Contact> contacts = cs.findAll();
    
    model.addAttribute("contacts", contacts);
    return "employeesListDisplay";
  }
}
