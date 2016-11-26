package org.bukharov.procurementDepartment.logic.dto.input;

public class InputPublicationOfficeBODTO {
	
	private String name;
	private String location;
	private String description;
	
	public InputPublicationOfficeBODTO(String name, String location, String description) {
		super();
		this.name = name;
		this.location = location;
		this.description = description;
	} 
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
}
