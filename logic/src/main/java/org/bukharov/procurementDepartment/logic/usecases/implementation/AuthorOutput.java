package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.output.OutputAuthorBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class AuthorOutput implements UseCaseOutput<OutputAuthorBODTO> {
	OutputAuthorBODTO authorBODTO;
	
	public AuthorOutput() {	}
	
	public AuthorOutput(OutputAuthorBODTO authorBODTO){
		this.authorBODTO = authorBODTO;
	}
	
	public void setData(OutputAuthorBODTO authorDTO){
		this.authorBODTO = authorDTO;
	}
	
	public OutputAuthorBODTO getData(){
		return this.authorBODTO;
	}
}
