package org.bukharov.procurementDepartment.logic.usecases;

import org.bukharov.procurementDepartment.logic.dto.OutputEditionBODTO;

public interface PublicationOfficePlanExecution<T> {
	public UseCaseOutput<OutputEditionBODTO> execute(T dto);
}
