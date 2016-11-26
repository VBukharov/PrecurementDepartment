package org.bukharov.procurementDepartment.model.repository;

import java.io.Serializable;
import java.util.List;

import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.springframework.data.repository.CrudRepository;

public interface PublicationOfficeRepository
    extends CrudRepository<PublicationOffice, Serializable> {
  public List<PublicationOffice> findByName(String name);

  public List<PublicationOffice> findByLocation(String location);

  public List<PublicationOffice> findByDescription(String description);
  
  public PublicationOffice findByNameAndLocation(String location, String description);
}
