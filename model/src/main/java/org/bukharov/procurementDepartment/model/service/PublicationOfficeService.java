package org.bukharov.procurementDepartment.model.service;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;

public interface PublicationOfficeService {
  List<PublicationOffice> findAll();

  public List<PublicationOffice> findByName(String name);

  public List<PublicationOffice> findByLocation(String location);

  public List<PublicationOffice> findByDescription(String description);
}
