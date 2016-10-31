package org.bukharov.procurementDepartment.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "edition")
public class Edition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer year;
	private Integer quantityOfPapers;
	private Integer quantity;
	private String annotation;
	private PublicationOffice publicationOffice;
	public Set<Author> authorSet;

	/**
	 * @return the id
	 */

	public Edition() {
	}

	public Edition(Integer id, String name, Integer year, Integer quantityOfPapers, Integer quantity, String annotation,
			PublicationOffice publicationOffice, Set<Author> authorSet) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.quantityOfPapers = quantityOfPapers;
		this.quantity = quantity;
		this.annotation = annotation;
		this.publicationOffice = publicationOffice;
		this.authorSet = authorSet;
	}

	@Id
	@Column(name = "edition_id", insertable = true, updatable = true)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Basic
	@Column(name = "edition_name")
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	@Basic
	@Column(name = "edition_year")
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return the quantityOfPapers
	 */
	@Basic
	@Column(name = "edition_quantity_of_papers")
	public Integer getQuantityOfPapers() {
		return quantityOfPapers;
	}

	/**
	 * @param quantityOfPapers
	 *            the quantityOfPapers to set
	 */
	public void setQuantityOfPapers(Integer quantityOfPapers) {
		this.quantityOfPapers = quantityOfPapers;
	}

	/**
	 * @return the quantity
	 */
	@Basic
	@Column(name = "edition_quantity")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the annotation
	 */
	@Basic
	@Column(name = "edition_annotation")
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * @param annotation
	 *            the annotation to set
	 */
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	/**
	 * @return the publicationOffice
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "publ_id", referencedColumnName = "publ_id")
	public PublicationOffice getPublicationOffice() {
		return publicationOffice;
	}

	/**
	 * @param publicationOffice
	 *            the publicationOffice to set
	 */
	public void setPublicationOffice(PublicationOffice publicationOffice) {
		this.publicationOffice = publicationOffice;
	}
	
	

	/**
	 * @return the authorSet
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="edition_author",
			joinColumns=@JoinColumn(name="edition_id", referencedColumnName="edition_id"),
			inverseJoinColumns=@JoinColumn(name="author_id", referencedColumnName="author_id"))
	public Set<Author> getAuthorSet() {
		return authorSet;
	}

	/**
	 * @param authorSet the authorSet to set
	 */
	public void setAuthorSet(Set<Author> authorSet) {
		this.authorSet = authorSet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		boolean result = false;
		if(arg0 instanceof Edition){
			Edition edition = (Edition) arg0;
			if(this.id.equals(edition.id) 
					&& this.name.equals(edition.name) 
					&& this.year.equals(edition.year) 
					&& this.quantity.equals(edition.quantity) 
					&& this.quantityOfPapers.equals(edition.quantityOfPapers)
					&& this.publicationOffice.equals(edition) 
					&& this.annotation.equals(edition.annotation))
				result = true;
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.year + ", "+ this.annotation + ", " + this.quantity + ", " +
				this.quantityOfPapers ;
	}
	
	

}
