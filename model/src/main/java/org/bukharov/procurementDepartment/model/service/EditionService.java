package org.bukharov.procurementDepartment.model.service;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Edition;

public interface EditionService {
  public List<Edition> findAll();

  public List<Edition> findByName(String name);

  public List<Edition> findByYear(Integer year);

  public List<Edition> findByNameAndYear(String name, Integer year);

  public Edition save(Edition edition);

  public void delete(Edition edition);
}
