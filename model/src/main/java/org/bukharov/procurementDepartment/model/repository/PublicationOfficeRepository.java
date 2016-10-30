package org.bukharov.procurementDepartment.model.repository;

import java.io.Serializable;
import java.util.List;

import org.bukharov.procurementDepartment.model.entity.PublicationOffice;
import org.springframework.data.repository.CrudRepository;

public interface PublicationOfficeRepository extends CrudRepository<PublicationOffice, Serializable> {
}
