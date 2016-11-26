package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.output.OutputPublicationOfficeBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class PublicationOfficeOutput implements UseCaseOutput<OutputPublicationOfficeBODTO> {

	OutputPublicationOfficeBODTO publicationOfficeBODTO;
	
	public PublicationOfficeOutput() {
		// TODO Auto-generated constructor stub
	}
	
	public PublicationOfficeOutput(OutputPublicationOfficeBODTO publicationOfficeBODTO){
		this.publicationOfficeBODTO = publicationOfficeBODTO;
	}
	
	@Override
	public void setData(OutputPublicationOfficeBODTO data) {
		// TODO Auto-generated method stub
		this.publicationOfficeBODTO = data;
	}

	@Override
	public OutputPublicationOfficeBODTO getData() {
		// TODO Auto-generated method stub
		return this.publicationOfficeBODTO;
	}

}
