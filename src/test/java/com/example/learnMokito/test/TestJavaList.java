package com.example.learnMokito.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;


public class TestJavaList {
	
	
	@Test
	public void testListSize() {
		List mockls = mock(List.class);
		
		// first call, return 2, then call return 3
		when(mockls.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(mockls.size(), 2);
		assertEquals(mockls.size(), 3);
		// after that, always 3
		System.out.println(mockls.size());
		System.out.println(mockls.size());
		
	}
	
	
	@Test
	public void testListGet() {
		List<String> mockls = mock(List.class);
		
		// argument matcher
		when(mockls.get(Mockito.anyInt())).thenReturn("mocked");
		
		assertEquals(mockls.get(1), "mocked");
		assertEquals(mockls.get(11), "mocked");
		
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testListException() {
		List mockls = Mockito.mock(List.class);
		
		Mockito.when(mockls.get(0)).thenThrow(new RuntimeException("forbidden"));
		
		mockls.get(0);
		
	}
	

}
