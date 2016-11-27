package org.bukharov.procurementDepartment.logic.businessmodel;

public class PublicationOfficeBO {

	private String name;
	private String location;
	private String description;

	public PublicationOfficeBO(String name, String location, String description) {
		if (name == null || name.isEmpty() || location == null || location.isEmpty() || description == null
				|| description.isEmpty())
			throw new IllegalArgumentException(
					"Все поля класса PublicationOfficeBO должны быть инициализированы не пустым значением! "
							+ " Ошибка создания при name=" + name + ", location=" + location + ", description="
							+ description);
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
