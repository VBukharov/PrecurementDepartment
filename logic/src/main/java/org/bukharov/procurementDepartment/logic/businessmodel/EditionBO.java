package org.bukharov.procurementDepartment.logic.businessmodel;

public class EditionBO {

	private String name;
	private Integer year;
	private Integer quantity;
	private String annotation;
	private Integer quantityOfPapers;
	private AuthorBO author;
	private PublicationOfficeBO publicationOffice;

	public EditionBO(String name, Integer year, Integer quantity, String annotation, Integer quantityOfPapers,
			AuthorBO author, PublicationOfficeBO publicationOffice) {

		if (name == null || name.isEmpty() || year == null || year <= 0 || quantity == null || quantity <= 0 ||
				annotation == null || annotation.isEmpty() || author == null || publicationOffice == null) {
			throw new IllegalArgumentException(
					" Все поля класса EditionBO должны быть инициализированы не пустым значением! "
							+ " Ошибка создания при name=" + name + ", surname=" + ", secondName=" + ", biography=");
		}
		this.name = name;
		this.year = year;
		this.quantity = quantity;
		this.annotation = annotation;
		this.quantityOfPapers = quantityOfPapers;
		this.author = author;
		this.publicationOffice = publicationOffice;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @return the quantityOfPapers
	 */
	public Integer getQuantityOfPapers() {
		return quantityOfPapers;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @return the annotation
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * @return the author
	 */
	public AuthorBO getAuthor() {
		return author;
	}

	/**
	 * @return the publicationOffice
	 */
	public PublicationOfficeBO getPublicationOffice() {
		return publicationOffice;
	}

	/**
	 * Увеличение количества в библиотеке
	 * 
	 * @param addition
	 */
	public void addQuantity(int addition) {
		this.quantity += addition;
	}

	/**
	 * Уменьшение количества в библиотеке
	 * 
	 * @param substraction
	 */
	public void subQuantity(int substraction) {
		this.quantity -= substraction;
	}

}
