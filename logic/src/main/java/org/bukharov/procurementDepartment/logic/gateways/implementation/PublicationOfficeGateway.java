package org.bukharov.procurementDepartment.logic.gateways.implementation;

import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.logic.gateways.mappers.PublicationOfficeGatewayMapper;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficeGateway
		implements org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway {

	@Autowired
	private PublicationOfficeService service;
	
	@Override
	public PublicationOfficeBO findById(int id) {
		return PublicationOfficeGatewayMapper.createPublicationOfficeBO(service.findById(id));
	}

	@Override
	public List<PublicationOfficeBO> findAll() {
		return PublicationOfficeGatewayMapper.createPublicationOfficeBOList(service.findAll());
	}

	@Override
	public int create(PublicationOfficeBO publicationOfficeBO) {
		PublicationOffice publicationOffice = service.save(PublicationOfficeGatewayMapper.createPublicationOffice(publicationOfficeBO));
		return publicationOffice.getId();
	}

	@Override
	public void delete(PublicationOfficeBO publicationOfficeBO) {
		service.delete(PublicationOfficeGatewayMapper.createPublicationOffice(publicationOfficeBO));
	}

	@Override
	public void update(PublicationOfficeBO publicationOfficeBO) {
		service.save(PublicationOfficeGatewayMapper.createPublicationOffice(publicationOfficeBO));
	}

}
