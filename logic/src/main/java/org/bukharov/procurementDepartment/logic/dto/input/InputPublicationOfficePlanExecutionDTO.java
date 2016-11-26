package org.bukharov.procurementDepartment.logic.dto.input;

import java.util.List;

public class InputPublicationOfficePlanExecutionDTO {
	
	private Integer publicationOfficeId;
	private List<InputEditionBODTO> dtoList;
	
	public InputPublicationOfficePlanExecutionDTO(Integer publicationOfficeId, List<InputEditionBODTO> dtoList) {
		super();
		this.publicationOfficeId = publicationOfficeId;
		this.dtoList = dtoList;
	}
	/**
	 * @return the publicationOfficeId
	 */
	public Integer getPublicationOfficeId() {
		return publicationOfficeId;
	}
	/**
	 * @param publicationOfficeId the publicationOfficeId to set
	 */
	public void setPublicationOfficeId(Integer publicationOfficeId) {
		this.publicationOfficeId = publicationOfficeId;
	}
	/**
	 * @return the dtoList
	 */
	public List<InputEditionBODTO> getDtoList() {
		return dtoList;
	}
	/**
	 * @param dtoList the dtoList to set
	 */
	public void setDtoList(List<InputEditionBODTO> dtoList) {
		this.dtoList = dtoList;
	}
	
	
}
