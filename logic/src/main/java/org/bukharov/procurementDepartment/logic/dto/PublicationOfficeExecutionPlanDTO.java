package org.bukharov.procurementDepartment.logic.dto;

public class PublicationOfficeExecutionPlanDTO {

	private Integer authorId;
	private Integer publicationOfficceId;
	private String editionName;
	private Integer editionYear;
	private Integer editionQuantity;
	private Integer editionPaperQuantity;
	private String editionAnnotation;

	// TODO: Добавить создание Издания на основе DTO

	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId
	 *            the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	/**
	 * @return the publicationOfficceId
	 */
	public Integer getPublicationOfficceId() {
		return publicationOfficceId;
	}

	/**
	 * @param publicationOfficceId
	 *            the publicationOfficceId to set
	 */
	public void setPublicationOfficceId(Integer publicationOfficceId) {
		this.publicationOfficceId = publicationOfficceId;
	}

	/**
	 * @return the editionName
	 */
	public String getEditionName() {
		return editionName;
	}

	/**
	 * @param editionName
	 *            the editionName to set
	 */
	public void setEditionName(String editionName) {
		this.editionName = editionName;
	}

	/**
	 * @return the editionYear
	 */
	public Integer getEditionYear() {
		return editionYear;
	}

	/**
	 * @param editionYear
	 *            the editionYear to set
	 */
	public void setEditionYear(Integer editionYear) {
		this.editionYear = editionYear;
	}

	/**
	 * @return the editionQuantity
	 */
	public Integer getEditionQuantity() {
		return editionQuantity;
	}

	/**
	 * @param editionQuantity
	 *            the editionQuantity to set
	 */
	public void setEditionQuantity(Integer editionQuantity) {
		this.editionQuantity = editionQuantity;
	}

	/**
	 * @return the editionPaperQuantity
	 */
	public Integer getEditionPaperQuantity() {
		return editionPaperQuantity;
	}

	/**
	 * @param editionPaperQuantity
	 *            the editionPaperQuantity to set
	 */
	public void setEditionPaperQuantity(Integer editionPaperQuantity) {
		this.editionPaperQuantity = editionPaperQuantity;
	}

	/**
	 * @return the editionAnnotation
	 */
	public String getEditionAnnotation() {
		return editionAnnotation;
	}

	/**
	 * @param editionAnnotation
	 *            the editionAnnotation to set
	 */
	public void setEditionAnnotation(String editionAnnotation) {
		this.editionAnnotation = editionAnnotation;
	}

}
