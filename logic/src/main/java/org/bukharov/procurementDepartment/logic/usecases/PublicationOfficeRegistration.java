package org.bukharov.procurementDepartment.logic.usecases;

import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeBODTO;

public interface PublicationOfficeRegistration {
	public UseCaseOutput<PublicationOfficeBODTO> execute(String name, String location, String description);
}
