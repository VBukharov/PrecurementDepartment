package org.bukharov.procurementDepartment.logic.businessmodel;

import org.junit.Test;

public class EditionBOTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void emptyFieldsTest(){
		new EditionBO("", 123, 134, "fsdsg", 45245, 
				new AuthorBO("test", "test", "test", "test"), 
				new PublicationOfficeBO("test", "test", "test"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void negativeIntegerFieldTest(){
		new EditionBO("", -123, 134, "fsdsg", 45245, 
				new AuthorBO("test", "test", "test", "test"), 
				new PublicationOfficeBO("test", "test", "test"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void zeroIntegerFieldTest(){
		new EditionBO("", 0, 134, "fsdsg", 45245, 
				new AuthorBO("test", "test", "test", "test"), 
				new PublicationOfficeBO("test", "test", "test"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullFieldsTest(){
		new EditionBO(null, 0, 134, "fsdsg", 45245, 
				new AuthorBO("test", "test", "test", "test"), 
				new PublicationOfficeBO("test", "test", "test"));
	}
}
