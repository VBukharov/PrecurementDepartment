package org.bukharov.procurementDepartment.model.service;

import java.util.List;

import org.bukharov.procurementDepartment.model.entity.PublicationOffice;

public interface PublicationOfficeService {
	
	public PublicationOffice findById(int id);

	public List<PublicationOffice> findAll();

	public List<PublicationOffice> findByName(String name);

	public List<PublicationOffice> findByLocation(String location);

	public List<PublicationOffice> findByDescription(String description);

	public PublicationOffice findByNameAndLocation(String location, String description);

	public PublicationOffice save(PublicationOffice publicationOffice);

	public void delete(PublicationOffice publicationOffice);
}
