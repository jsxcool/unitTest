package com.example.learnMokito.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.mockito.Mockito;

import com.example.learnMokito.dbConnection.User;
import com.example.learnMokito.dbConnection.UserDAO;
import com.example.learnMokito.dbConnection.UserService;

public class TestMockDAO {
	
	@Test
	public void MockDAO() {
		
		// create a mock DAO interface
		UserDAO ud = Mockito.mock(UserDAO.class);
		// mock the findById() method
		Mockito.when(ud.findById(Mockito.anyLong())).thenReturn(new User(1l, "jsx"));
		
		UserService us = new UserService(ud);
		assertEquals(us.findUser(3123l), new User(1l, "jsx"));
		
	}
	
}
