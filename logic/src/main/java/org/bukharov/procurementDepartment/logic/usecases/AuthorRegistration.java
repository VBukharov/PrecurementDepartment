package org.bukharov.procurementDepartment.logic.usecases;

import org.bukharov.procurementDepartment.logic.dto.AuthorBODTO;

public interface AuthorRegistration{
	public UseCaseOutput<AuthorBODTO> execute(String name, String surname, String lastname, String biography, Integer birthYear);
}
