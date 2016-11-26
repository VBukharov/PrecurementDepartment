package org.bukharov.procurementDepartment.model.repository;

import java.io.Serializable;
import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Serializable>{
  public List<Contact> findByFirstName(String firstName);
  public List<Contact> findByLastName(String lastName);
  public List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
