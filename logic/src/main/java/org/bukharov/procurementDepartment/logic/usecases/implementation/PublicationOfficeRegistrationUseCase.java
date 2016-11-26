package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.logic.dto.input.InputPublicationOfficeBODTO;
import org.bukharov.procurementDepartment.logic.dto.output.OutputPublicationOfficeBODTO;
import org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway;
import org.bukharov.procurementDepartment.logic.usecases.PublicationOfficeRegistration;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficeRegistrationUseCase implements PublicationOfficeRegistration<InputPublicationOfficeBODTO> {

	@Autowired
	private PublicationOfficeGateway gateway;
	
	/* (non-Javadoc)
	 * @see org.bukharov.procurementDepartment.logic.usecases.PublicationOfficeRegistration#execute(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public UseCaseOutput<OutputPublicationOfficeBODTO> execute(InputPublicationOfficeBODTO inputDto) {
		int id = gateway.create(new PublicationOfficeBO(inputDto.getName(), inputDto.getLocation(), inputDto.getDescription()));
		return new PublicationOfficeOutput(new OutputPublicationOfficeBODTO(id));
	}
	
}
