package com.database.fmmvc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import org.junit.Test;
public class TestDataBaseConnection 
{
	@Test
	public void testConnection() {
		Connection connection=dataBaseUtil.getConnection();
		assertNotNull("no conectected",connection);
		try {
			
		
		connection.close();
		assertTrue(connection.isClosed());
		}catch (Exception e) {
			
		}
	}

}
