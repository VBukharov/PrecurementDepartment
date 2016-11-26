package org.bukharov.procurementDepartment.logic.usecases;

import org.bukharov.procurementDepartment.logic.dto.output.OutputPublicationOfficeBODTO;

public interface PublicationOfficeRegistration<T> {
	public UseCaseOutput<OutputPublicationOfficeBODTO> execute(T inputDto);
}
