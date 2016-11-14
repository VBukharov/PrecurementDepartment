package org.bukharov.procurementDepartment.logic.usecases;

import java.util.List;

import org.bukharov.procurementDepartment.logic.dto.EditionBODTO;
import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeExecutionPlanDTO;

public interface PublicationOfficePlanExecution {
	public UseCaseOutput<EditionBODTO> execute(Integer publicationOfficeId, List<PublicationOfficeExecutionPlanDTO> dtoList);
}
