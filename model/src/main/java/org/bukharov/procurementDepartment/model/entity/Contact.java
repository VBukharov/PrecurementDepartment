package org.bukharov.procurementDepartment.model.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="contact")
public class Contact {
  private Integer id;
  private String firstName;
  private String lastName;
  private Date birthDate;
  private int version;
  private Set<ContactTelDetail> contactTelDetail = new HashSet<>();
  private Set<Hobby> contactHobbies = new HashSet<>(); 
  
  @Id
  @Column(name="id", insertable = true, updatable = true)
  public int getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  
  @Basic
  @Column(name="first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Basic
  @Column(name="last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Basic
  @Temporal(TemporalType.DATE)
  @Column(name="birth_date")
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Basic
  @Column(name="version")
  public int getVersion() {
    return version;
  }
  public void setVersion(int version) {
    this.version = version;
  }
  
  @OneToMany(mappedBy="id", cascade=CascadeType.ALL, orphanRemoval=true)
  public Set<ContactTelDetail> getContactTelDetail(){
    return contactTelDetail;
  }
  
  public void setContactTelDetail(Set<ContactTelDetail> contactTelDetail){
    this.contactTelDetail = contactTelDetail;
  }
  
  @ManyToMany
  @JoinTable(name="contact_hobby_detail",
             joinColumns = @JoinColumn(name="contact_id"),
             inverseJoinColumns = @JoinColumn(name="hobby_id"))
  public Set<Hobby> getContactHobbies() {
    return contactHobbies;
  }
  public void setContactHobbies(Set<Hobby> contactHobbies) {
    this.contactHobbies = contactHobbies;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "ContactEntity{" +
        "version=" + version +
        ", birthDate=" + birthDate +
        ", lastName='" + lastName + '\'' +
        ", firstName='" + firstName + '\'' +
        ", id=" + id +
        '}';
  }
  
  
  
}
