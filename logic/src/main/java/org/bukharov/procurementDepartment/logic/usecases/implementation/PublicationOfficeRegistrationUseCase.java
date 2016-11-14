package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeBODTO;
import org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway;
import org.bukharov.procurementDepartment.logic.usecases.PublicationOfficeRegistration;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficeRegistrationUseCase implements PublicationOfficeRegistration {

	@Autowired
	private PublicationOfficeGateway gateway;
	
	/* (non-Javadoc)
	 * @see org.bukharov.procurementDepartment.logic.usecases.PublicationOfficeRegistration#execute(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public UseCaseOutput<PublicationOfficeBODTO> execute(String name, String location, String description) {
		int id = gateway.create(new PublicationOfficeBO(name, location, description));
		return new PublicationOfficeOutput(new PublicationOfficeBODTO(id));
	}
	
}
