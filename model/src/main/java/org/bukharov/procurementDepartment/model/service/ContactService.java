package org.bukharov.procurementDepartment.model.service;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Contact;

public interface ContactService {
  List<Contact> findAll();
  List<Contact> findByFirstName(String firstName);
  List<Contact> findByLastName(String lastName);
  List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
