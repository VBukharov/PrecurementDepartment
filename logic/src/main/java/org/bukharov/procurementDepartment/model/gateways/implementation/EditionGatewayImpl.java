package org.bukharov.procurementDepartment.model.gateways.implementation;

import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;
import org.bukharov.procurementDepartment.logic.gateways.EditionGateway;
import org.bukharov.procurementDepartment.model.entity.Edition;
import org.bukharov.procurementDepartment.model.gateways.mappers.EditionGatewayMapper;
import org.bukharov.procurementDepartment.model.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditionGatewayImpl implements EditionGateway {

	@Autowired
	private EditionService service;
	
	@Override
	public EditionBO findById(int id) {
		return EditionGatewayMapper.createEditionBO(service.findById(id));
	}

	@Override
	public List<EditionBO> findAll() {
		return EditionGatewayMapper.createAuthorBOList(service.findAll());
	}

	@Override
	public int create(EditionBO editionBO) {
		Edition edition = service.save(EditionGatewayMapper.createEdition(editionBO));
		return edition.getId();
	}

	@Override
	public void delete(int id) {
		Edition edition = service.findById(id);
		service.delete(edition);
	}

	@Override
	public void update(int id) {
		Edition edition = service.findById(id);
		service.save(edition);
	}
}
