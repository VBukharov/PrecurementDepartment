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
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String surname;
	private String secondName;
	private String biography;
	private Set<Edition> editionSet;
	
	public Author() {}
	
	public Author(int id, String name, String surname, String secondName, String biography){
	  this.id = id;
	  this.name = name;
	  this.surname = surname;
	  this.secondName = secondName;
	  this.biography = biography;
	}
	
	@Id
	@Column(name="author_id", insertable=true, updatable=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Basic
	@Column(name="author_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
	@Column(name="author_surname")
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Basic
	@Column(name="author_second_name")
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Basic
	@Column(name="author_biography")
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}

	
  /**
	 * @return the editionSet
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="edition_author",
				joinColumns=@JoinColumn(name="author_id"),
				inverseJoinColumns=@JoinColumn(name="edition_id"))
	public Set<Edition> getEditionSet() {
		return editionSet;
	}

	/**
	 * @param editionSet the editionSet to set
	 */
	public void setEditionSet(Set<Edition> editionSet) {
		this.editionSet = editionSet;
	}

@Override
  public boolean equals(Object obj) {
    boolean result = false;
    if(obj instanceof Author){
      Author author = (Author)obj;
      if(this.id == author.id && this.name.equals(author.name) && this.secondName.equals(author.secondName)
          && this.surname.equals(author.surname) && this.biography.equals(author.biography))
        result = true;
    }
    return result;
  }
	
	
}
