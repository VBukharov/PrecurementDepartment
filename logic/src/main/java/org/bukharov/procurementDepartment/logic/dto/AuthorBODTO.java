package org.bukharov.procurementDepartment.logic.dto;

import org.bukharov.procurementDepartment.logic.businessmodel.AuthorBO;

public class AuthorBODTO {

	private int id;

	public AuthorBODTO() {
	}
	
	public AuthorBODTO(int id) {
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
