package org.bukharov.procurementDepartment.logic.businessmodel;

public class AuthorBO {

	private String name;
	private String surname;
	private String secondName;
	private String biography;

	public AuthorBO(String name, String surname, String secondName, String biography){
		if( name == null || name.isEmpty() || surname == null || surname.isEmpty() || 
				secondName == null || secondName.isEmpty() || biography == null || biography.isEmpty()){
			throw new IllegalArgumentException(" Все поля класса AuthorBO должны быть инициализированы не пустым значением! "
					+ ". Ошибка создания при name=" + name + ", surname=" + surname + ", secondName=" + secondName + ", biography="+biography );
		}
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
