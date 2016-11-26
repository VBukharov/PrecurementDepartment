/**
 * 
 */
package org.bukharov.procurementDepartment.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author bukharov
 *
 */

public class ContactHobbyDetailPK implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private Integer contactId;
  private String hobbyId;

  @Column(name="contact_id", nullable=false, insertable=false, updatable=false)
  @Id
  public Integer getContactId() {
    return contactId;
  }
  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }
  
  @Column(name="hobby_id", nullable=false, insertable=false, updatable=false)
  @Id
  public String getHobbyId() {
    return hobbyId;
  }
  public void setHobbyId(String hobbyId) {
    this.hobbyId = hobbyId;
  }
}
