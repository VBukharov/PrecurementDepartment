package org.bukharov.procurementDepartment.model.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publ_office")
public class PublicationOffice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String location;
	private String description;
	
	public PublicationOffice() {}
	
	public PublicationOffice(int id, String name, String location, String description){
	  this.id = id;
	  this.name = name;
	  this.location = location;
	  this.description = description;
	}
	
	@Id
	@Column(name="publ_id", insertable=true, updatable=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Basic
	@Column(name="publ_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
	@Column(name="publ_location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Basic
	@Column(name="publ_description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

  @Override
  public boolean equals(Object obj) {
    boolean result = false;
    if(obj instanceof PublicationOffice){
      PublicationOffice tmp = (PublicationOffice)obj;
      if(this.id == tmp.id && this.name.equals(tmp.name) 
          && this.location.equals(tmp.location) && this.description.equals(tmp.description))
        result = true;
    }
    return result;
  }
	
	
}
