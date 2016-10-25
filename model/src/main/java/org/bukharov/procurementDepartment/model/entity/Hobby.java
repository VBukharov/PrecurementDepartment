package org.bukharov.procurementDepartment.model.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="hobby")
public class Hobby {
  private Integer id;
  private Set<Contact> contacts;
  
  @Id
  @Column(name="hobby_id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @ManyToMany
  @JoinTable(name="contact_hobby_detail",
            joinColumns=@JoinColumn(name="hobby_id"),
            inverseJoinColumns=@JoinColumn(name="contact_id"))
  public Set<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(Set<Contact> contacts) {
    this.contacts = contacts;
  }
  
  
}
