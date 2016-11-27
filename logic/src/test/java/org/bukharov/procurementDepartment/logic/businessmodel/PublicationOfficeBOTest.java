package org.bukharov.procurementDepartment.logic.businessmodel;

import org.junit.Test;

public class PublicationOfficeBOTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void emptyFieldsTest(){
		new PublicationOfficeBO("", "location", "description");
				
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullFieldsTest(){
		new PublicationOfficeBO(null, "Location", "desription");
	}
}
