package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.dto.AuthorBODTO;
import org.bukharov.procurementDepartment.logic.gateways.AuthorGateway;
import org.bukharov.procurementDepartment.logic.usecases.AuthorRegistration;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.bukharov.procurementDepartment.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorRegistrationUseCase implements AuthorRegistration {

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
	public UseCaseOutput<AuthorBODTO> execute(String name, String surname, String lastname, String biography, Integer birthYear) {
		int id = gateway.create(new AuthorBO(name, surname, lastname, biography));
		return new AuthorOutput(new AuthorBODTO(id));
	}
	
}
