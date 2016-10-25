package org.bukharov.procurementDepartment.model.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact_tel_detail")
public class ContactTelDetail {
  private Integer id;
  private String telType;
  private String telNumber;
  private Integer version;
  private Contact contact; 
  
  @Id
  @Column(name="id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  
  @Basic
  @Column(name="tel_type")
  public String getTelType() {
    return telType;
  }
  public void setTelType(String telType) {
    this.telType = telType;
  }
  
  @Basic
  @Column(name="tel_number")
  public String getTelNumber() {
    return telNumber;
  }
  public void setTelNumber(String telNumber) {
    this.telNumber = telNumber;
  }
  
  @Basic
  @Column(name="version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }
  
  @ManyToOne
  @JoinColumn(name="contact_id", referencedColumnName="id", nullable=false)
  public Contact getContact() {
    return contact;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  
}
