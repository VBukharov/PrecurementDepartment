package org.bukharov.procurementDepartment.model.gateways.implementation;

import java.util.List;

import org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway;
import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.bukharov.procurementDepartment.model.gateways.mappers.PublicationOfficeGatewayMapper;
import org.bukharov.procurementDepartment.model.service.PublicationOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficeGatewayImpl implements PublicationOfficeGateway {

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
		PublicationOffice publicationOffice = service
				.save(PublicationOfficeGatewayMapper.createPublicationOffice(publicationOfficeBO));
		return publicationOffice.getId();
	}

	@Override
	public void delete(int id) {
		PublicationOffice publicationOffice = service.findById(id);
		service.delete(publicationOffice);
	}

	@Override
	public void update(int id) {
		PublicationOffice office = service.findById(id);
		service.save(office);
	}

}
