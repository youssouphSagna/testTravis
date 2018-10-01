package test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestUser {
	
	User sut;
	
	@Before
	public void init() {
		
		sut = new User(1, "SAGNA", "YOUSS", 25);
		
	}
	
	@Test
	public void testUser() {
		
		assertTrue(sut.getFirstName().equals("SAGNA"));
		assertTrue(sut.getId() == 1);
		assertTrue(sut.getLastName().equals("YOUSS"));
		
		assertFalse(sut.getAge() == 24);
		
	}

}
