package org.bukharov.procurementDepartment.logic.usecases.implementation;

import java.util.ArrayList;
import java.util.List;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;
import org.bukharov.procurementDepartment.logic.businessmodel.EditionBO;
import org.bukharov.procurementDepartment.logic.businessmodel.PublicationOfficeBO;
import org.bukharov.procurementDepartment.logic.dto.EditionBODTO;
import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeExecutionPlanDTO;
import org.bukharov.procurementDepartment.logic.gateways.AuthorGateway;
import org.bukharov.procurementDepartment.logic.gateways.EditionGateway;
import org.bukharov.procurementDepartment.logic.gateways.PublicationOfficeGateway;
import org.bukharov.procurementDepartment.logic.usecases.PublicationOfficePlanExecution;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicationOfficePlanExecutionUseCase implements PublicationOfficePlanExecution{

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
	public UseCaseOutput<EditionBODTO> execute(Integer publicationOfficeId, List<PublicationOfficeExecutionPlanDTO> dtoList) {
		List<Integer> idList = new ArrayList<>();
		for(PublicationOfficeExecutionPlanDTO dto : dtoList){
			
			AuthorBO authorBO = authorGateway.findById(dto.getAuthorId());
			PublicationOfficeBO publicationOfficeBO = publOfficeGateway.findById(dto.getPublicationOfficceId());
			
			EditionBO editionBO = new EditionBO(dto.getEditionName(), dto.getEditionYear(), dto.getEditionQuantity(),
					dto.getEditionAnnotation(), dto.getEditionPaperQuantity(), authorBO, publicationOfficeBO);
			
			idList.add(gateway.create(editionBO));
		}

		return new EditionOutput(new EditionBODTO(idList));
	}
	
}
