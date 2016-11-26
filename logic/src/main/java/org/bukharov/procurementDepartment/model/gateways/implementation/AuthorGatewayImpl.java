package org.bukharov.procurementDepartment.model.gateways.implementation;

import java.util.List;

import org.bukharov.procurementDepartment.logic.gateways.AuthorGateway;
import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.model.gateways.mappers.AuthorGatewayMapper;
import org.bukharov.procurementDepartment.model.entity.Author;
import org.bukharov.procurementDepartment.model.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorGatewayImpl implements  AuthorGateway {

	@Autowired
	AuthorService service;
	
	@Override
	public AuthorBO findById(int id) {
		return AuthorGatewayMapper.createAuthorBO(service.findById(id));
	}

	@Override
	public List<AuthorBO> findAll() {
		return AuthorGatewayMapper.createAuthorBOList(service.findAll());
	}

	@Override
	public int create(AuthorBO authorBO) {
		Author author = service.save(AuthorGatewayMapper.createAuthor(authorBO));
		return author.getId();
	}

	@Override
	public void update(AuthorBO authorBO) {
		service.save(AuthorGatewayMapper.createAuthor(authorBO));
	}

	@Override
	public void delete(AuthorBO authorBO) {
		service.delete(AuthorGatewayMapper.createAuthor(authorBO));
	}
	
}
