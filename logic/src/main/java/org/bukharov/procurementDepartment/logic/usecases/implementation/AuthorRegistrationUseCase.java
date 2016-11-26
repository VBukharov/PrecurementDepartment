package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.dto.input.InputAuthorBODTO;
import org.bukharov.procurementDepartment.logic.dto.output.OutputAuthorBODTO;
import org.bukharov.procurementDepartment.logic.gateways.AuthorGateway;
import org.bukharov.procurementDepartment.logic.usecases.AuthorRegistration;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorRegistrationUseCase implements AuthorRegistration<InputAuthorBODTO> {

	@Autowired
	private AuthorGateway gateway;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bukharov.procurementDepartment.logic.usecases.AuthorRegistration#
	 * execute(java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.Integer)
	 */
	@Override
	public UseCaseOutput<OutputAuthorBODTO> execute(InputAuthorBODTO inputDto) {
		int id = gateway.create(new AuthorBO(inputDto.getName(), inputDto.getSurname(), inputDto.getSecondName(), inputDto.getBiography()));
		return new AuthorOutput(new OutputAuthorBODTO(id));
	}
	
}
