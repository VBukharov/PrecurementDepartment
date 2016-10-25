/**
 * 
 */
package org.bukharov.procurementDepartment.model.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author bukharov
 *
 */
@Entity
@Table(name="contact_hobby_detail")
@IdClass(ContactHobbyDetailPK.class)
public class ContactHobbyDetail {
  private Integer contactId;
  private String hobbyId;
  private Contact contact;
  
  @Id
  @Column(name="contact_id", nullable=false, insertable=true, updatable=true)
  public Integer getContactId() {
    return contactId;
  }
  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }
  
  @Basic
  @Column(name="hobby_id", nullable=false, insertable=true, updatable=true)
  public String getHobbyId() {
    return hobbyId;
  }
  public void setHobbyId(String hobbyId) {
    this.hobbyId = hobbyId;
  }
  
  @ManyToOne
  @JoinColumn(name="contact_id", referencedColumnName="id")
  public Contact getContact() {
    return contact;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  
  
}
