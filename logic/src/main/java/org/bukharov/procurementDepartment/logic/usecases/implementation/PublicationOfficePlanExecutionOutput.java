package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.OutputEditionBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class PublicationOfficePlanExecutionOutput implements UseCaseOutput<OutputEditionBODTO> {

	private OutputEditionBODTO editionBODTO;

	public PublicationOfficePlanExecutionOutput() {
		// TODO Auto-generated constructor stub
	}

	public PublicationOfficePlanExecutionOutput(OutputEditionBODTO editionBODTO) {
		this.editionBODTO = editionBODTO;
	}

	public void setData(OutputEditionBODTO editionBODTO) {
		this.editionBODTO = editionBODTO;
	}

	public OutputEditionBODTO getData() {
		return this.editionBODTO;
	}
}
