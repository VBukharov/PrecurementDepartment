package org.bukharov.procurementDepartment.logic.usecases.implementation;

import org.bukharov.procurementDepartment.logic.dto.AuthorBODTO;
import org.bukharov.procurementDepartment.logic.usecases.UseCaseOutput;

public class AuthorOutput implements UseCaseOutput<AuthorBODTO> {
	AuthorBODTO authorBODTO;
	
	public AuthorOutput() {	}
	
	public AuthorOutput(AuthorBODTO authorBODTO){
		this.authorBODTO = authorBODTO;
	}
	
	public void setData(AuthorBODTO authorDTO){
		this.authorBODTO = authorDTO;
	}
	
	public AuthorBODTO getData(){
		return this.authorBODTO;
	}
}
