package org.bukharov.procurementDepartment.logic.businessmodel;

public class AuthorBO {

	private String name;
	private String surname;
	private String secondName;
	private String biography;

	public AuthorBO() {}

	public AuthorBO(String name, String surname, String secondName, String biography) {
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.biography = biography;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}

}
