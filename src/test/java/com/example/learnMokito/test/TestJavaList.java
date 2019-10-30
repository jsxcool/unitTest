package com.example.learnMokito.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJavaList {
	
	@Test
	void testListSize() {
		List mockls = Mockito.mock(List.class);
		
		// first call, return 2, then call return 3
		Mockito.when(mockls.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(mockls.size(), 2);
		assertEquals(mockls.size(), 3);
		// after that, always 3
		System.out.println(mockls.size());
		System.out.println(mockls.size());
		
	}
	
	/*
	@Test
	void testListGet() {
		List<String> mockls = Mockito.mock(List.class);
		
		// argument matcher
		Mockito.when(mockls.get(Mockito.anyInt())).thenReturn("mocked");
		
		assertEquals(mockls.get(1), "mocked");
		assertEquals(mockls.get(11), "mocked");
		
	}
	
	
	@Test(expected = RuntimeException.class)
	void testListException() {
		List mockls = Mockito.mock(List.class);
		
		Mockito.when(mockls.get(0)).thenReturn(new RuntimeException("forbidden"));
		
		mockls.get(0);
		
	}
	*/
	

}
