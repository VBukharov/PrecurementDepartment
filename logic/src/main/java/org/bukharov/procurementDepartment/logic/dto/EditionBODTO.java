package org.bukharov.procurementDepartment.logic.dto;

import java.util.List;

public class EditionBODTO {
	private List<Integer> idList;

	public EditionBODTO() {
		// TODO Auto-generated constructor stub
	}
	
	public EditionBODTO(List<Integer> idList){
		this.idList = idList;
	}
	/**
	 * @return the idList
	 */
	public List<Integer> getIdList() {
		return idList;
	}

	/**
	 * @param idList the idList to set
	 */
	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
	
	
}
