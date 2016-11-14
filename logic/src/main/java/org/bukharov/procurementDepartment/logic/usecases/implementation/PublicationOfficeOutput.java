package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.PublicationOfficeBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class PublicationOfficeOutput implements UseCaseOutput<PublicationOfficeBODTO> {

	PublicationOfficeBODTO publicationOfficeBODTO;
	
	public PublicationOfficeOutput() {
		// TODO Auto-generated constructor stub
	}
	
	public PublicationOfficeOutput(PublicationOfficeBODTO publicationOfficeBODTO){
		this.publicationOfficeBODTO = publicationOfficeBODTO;
	}
	
	@Override
	public void setData(PublicationOfficeBODTO data) {
		// TODO Auto-generated method stub
		this.publicationOfficeBODTO = data;
	}

	@Override
	public PublicationOfficeBODTO getData() {
		// TODO Auto-generated method stub
		return this.publicationOfficeBODTO;
	}

}
