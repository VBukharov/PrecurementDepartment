package org.bukharov.procurementDepartment.logic.dto;

import java.util.List;

public class OutputEditionBODTO {
	private List<Integer> idList;

	public OutputEditionBODTO() {
		// TODO Auto-generated constructor stub
	}
	
	public OutputEditionBODTO(List<Integer> idList){
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
