package org.bukharov.procurementDepartment.logic.businessmodel;

import org.junit.Test;

public class AuthorBOTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void emptyFieldsTest(){
		new AuthorBO("", "surname","", "biography");
	}
	
	@Test//(expected=IllegalArgumentException.class)
	public void nullFieldsTest(){
		new AuthorBO(null, "surname","", "biography");
	}
	
}
