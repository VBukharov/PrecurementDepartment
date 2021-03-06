package org.bukharov.procurementDepartment.model.service;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.Author;

public interface AuthorService {

	public Author findById(int id);

	public List<Author> findAll();

	public List<Author> findByName(String name);

	public List<Author> findBySurname(String surname);

	public List<Author> findBySecondName(String secondName);

	public List<Author> findByNameAndSurnameAndSecondName(String name, String surname, String secondName);

	public Author findByNameAndSurnameAndSecondNameAndBiography(String name, String surname, String secondName,
			String biography);

	public Author save(Author author);

	public void delete(Author author);
}
