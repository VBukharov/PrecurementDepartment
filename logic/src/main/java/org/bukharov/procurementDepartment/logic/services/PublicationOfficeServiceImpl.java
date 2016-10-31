package org.bukharov.procurementDepartment.logic.services;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.model.entity.Contact;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.repository.PublicationOfficeRepository;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Component
@Service("publicationOfficeService")
@Repository
@Transactional
public class PublicationOfficeImpl implements PublicationOfficeService {
  @Autowired
  private PublicationOfficeRepository repository;

  /*
   * (non-Javadoc)
   * 
   * @see org.bukharov.procurementDepartment.model.service.PublicationOfficeService#findAll()
   */
  @Override
  public List<PublicationOffice> findAll() {
    return Lists.newArrayList(repository.findAll());
  }

  @Override
  public List<PublicationOffice> findByName(String name) {
    return repository.findByName(name);
  }

  @Override
  public List<PublicationOffice> findByLocation(String location) {
    return repository.findByLocation(location);
  }

  @Override
  public List<PublicationOffice> findByDescription(String description) {
    return repository.findByDescription(description);
  }

 

}
