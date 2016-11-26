package org.bukharov.procurementDepartment.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="hobby")
public class Hobby implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String id;
  private Set<Contact> contacts;
  
  @Id
  @Column(name="hobby_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @JsonBackReference
  @ManyToMany (fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
  @JoinTable(name="contact_hobby",
            joinColumns=@JoinColumn(name="hobby_id"),
            inverseJoinColumns=@JoinColumn(name="contact_id"))
  public Set<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(Set<Contact> contacts) {
    this.contacts = contacts;
  }
  
  
}
