package org.bukharov.procurementDepartment.logic.services;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.repository.EditionRepository;
import org.bukharov.procurementDepartment.model.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Component
@Service("editionService")
@Repository
@Transactional
public class EditionServiceImpl implements EditionService{

  @Autowired
  EditionRepository repository;
  
  @Override
  public List<Edition> findAll() {
    return Lists.newArrayList(repository.findAll());
  }

  @Override
  public List<Edition> findByName(String name) {
    return repository.findByName(name);
  }

  @Override
  public List<Edition> findByYear(Integer year) {
    return repository.findByYear(year);
  }

  @Override
  public List<Edition> findByNameAndYear(String name, Integer year) {
    return repository.findByNameAndYear(name, year);
  }

  @Override
  public Edition save(Edition edition) {
    return repository.save(edition);
  }

  @Override
  public void delete(Edition edition) {
    repository.delete(edition);
  }
  
}
