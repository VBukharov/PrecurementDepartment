package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.EditionBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class EditionOutput implements UseCaseOutput<EditionBODTO> {

	private EditionBODTO editionBODTO;

	public EditionOutput() {
		// TODO Auto-generated constructor stub
	}

	public EditionOutput(EditionBODTO editionBODTO) {
		this.editionBODTO = editionBODTO;
	}

	public void setData(EditionBODTO editionBODTO) {
		this.editionBODTO = editionBODTO;
	}

	public EditionBODTO getData() {
		return this.editionBODTO;
	}
}
