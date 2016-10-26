package org.bukharov.procurementDepartment.logic.services;

import java.util.List;

import javax.transaction.Transactional;
import com.google.common.collect.Lists;
import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.repository.ContactRepository;
import org.bukharov.procurementDepartment.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service("jpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactRepository contactRepository;
  
  @Override
  public List<Contact> findAll() {
    // TODO Auto-generated method stub
    return Lists.newArrayList(contactRepository.findAll());
  }

  @Override
  public List<Contact> findByFirstName(String firstName) {
    // TODO Auto-generated method stub
    return contactRepository.findByFirstName(firstName);
  }

  @Override
  public List<Contact> findByLastName(String lastName) {
    // TODO Auto-generated method stub
    return contactRepository.findByLastName(lastName);
  }

  @Override
  public List<Contact> findByFirstNameAndLastName(String firstName, String lastName) {
    // TODO Auto-generated method stub
    return contactRepository.findByFirstNameAndLastName(firstName, lastName);
  }
  
}
