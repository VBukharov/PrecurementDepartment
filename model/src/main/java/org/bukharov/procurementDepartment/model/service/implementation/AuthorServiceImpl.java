package org.bukharov.procurementDepartment.model.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.repository.AuthorRepository;
import org.bukharov.procurementDepartment.model.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Component
@Service("authorService")
@Repository
@Transactional
public class AuthorServiceImpl implements AuthorService {


	@Autowired
	AuthorRepository repository;

	@Override
	public Author findById(int id) {
		return repository.findOne(id);
	}
	
	@Override
	public List<Author> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public List<Author> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Author> findBySurname(String surname) {
		return repository.findBySurname(surname);
	}

	@Override
	public List<Author> findBySecondName(String secondName) {
		return repository.findBySecondName(secondName);
	}

	@Override
	public List<Author> findByNameAndSurnameAndSecondName(String name, String surname, String secondName) {
		return repository.findByNameAndSurnameAndSecondName(name, surname, secondName);
	}

	@Override
	public Author save(Author author) {
		return repository.save(author);
	}

	@Override
	public void delete(Author author) {
		repository.delete(author);
	}

}
