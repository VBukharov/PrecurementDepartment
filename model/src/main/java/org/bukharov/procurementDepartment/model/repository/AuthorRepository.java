package org.bukharov.procurementDepartment.model.repository;

import java.io.Serializable;
import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Serializable>{
  public List<Author> findByName(String name);

  public List<Author> findBySurname(String surname);

  public List<Author> findBySecondName(String secondName);
  
  public List<Author> findByNameAndSurnameAndSecondName(String name, String surname, String secondName);
}
