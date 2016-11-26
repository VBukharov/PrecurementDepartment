package org.bukharov.procurementDepartment.logic.usecases;

import org.bukharov.procurementDepartment.logic.dto.output.OutputAuthorBODTO;
import org.springframework.stereotype.Service;

public interface AuthorRegistration<T>{
	public UseCaseOutput<OutputAuthorBODTO> execute(T dto);
}
