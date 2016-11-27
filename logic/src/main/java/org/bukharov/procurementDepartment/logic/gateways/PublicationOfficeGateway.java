package org.bukharov.procurementDepartment.logic.gateways;

import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;

public interface PublicationOfficeGateway {

	public PublicationOfficeBO findById(int id);
	public List<PublicationOfficeBO> findAll();
	public int create(PublicationOfficeBO publicationOfficeBO);
	public void delete(int id);
	public void update(int id);
}
