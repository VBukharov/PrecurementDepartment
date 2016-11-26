package org.bukharov.procurementDepartment.logic.usecases.implementation;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;
import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.logic.dto.OutputEditionBODTO;
import org.bukharov.procurementDepartment.logic.dto.input.InputEditionBODTO;
import org.bukharov.procurementDepartment.logic.dto.input.InputPublicationOfficePlanExecutionDTO;
import org.bukharov.procurementDepartment.logic.gateways.AuthorGateway;
import org.bukharov.procurementDepartment.logic.gateways.EditionGateway;
import org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway;
import org.bukharov.procurementDepartment.logic.usecases.PublicationOfficePlanExecution;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficePlanExecutionUseCase implements PublicationOfficePlanExecution<InputPublicationOfficePlanExecutionDTO>{

	@Autowired
	private EditionGateway gateway;
	
	@Autowired
	private AuthorGateway authorGateway;
	
	@Autowired
	private PublicationOfficeGateway publOfficeGateway;
	/* (non-Javadoc)
	 * @see org.bukharov.procurementDepartment.logic.usecases.PublicationOfficePlanExecution#execute(java.lang.Integer, java.util.List)
	 */
	@Override
	public UseCaseOutput<OutputEditionBODTO> execute(InputPublicationOfficePlanExecutionDTO inputDto) {
		List<Integer> idList = new ArrayList<>();
		
		// TODO Проверка наличия издательства в БД
		PublicationOfficeBO publicationOfficeBO = publOfficeGateway.findById(inputDto.getPublicationOfficeId());
		
		for(InputEditionBODTO dto : inputDto.getDtoList()){
			
			AuthorBO authorBO = authorGateway.findById(dto.getAuthorId());
			
			// Создание Издания в методе DTO
			EditionBO editionBO = new EditionBO(dto.getEditionName(), dto.getEditionYear(), dto.getEditionQuantity(),
					dto.getEditionAnnotation(), dto.getEditionPaperQuantity(), authorBO, publicationOfficeBO);
			
			idList.add(gateway.create(editionBO));
		}

		return new PublicationOfficePlanExecutionOutput(new OutputEditionBODTO(idList));
	}
	
}
