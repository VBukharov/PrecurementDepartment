package org.bukharov.procurementDepartment.model.repository;

import java.io.Serializable;
import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Edition;
import org.springframework.data.repository.CrudRepository;

public interface EditionRepository extends CrudRepository<Edition, Serializable> {
  public List<Edition> findByName(String name);

  public List<Edition> findByYear(Integer year);

  public List<Edition> findByNameAndYear(String name, Integer year);
}
