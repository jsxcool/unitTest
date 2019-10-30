package com.example.learnMokito.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import com.example.learnMokito.api.ExternalService;
import com.example.learnMokito.api.ServiceImp;

public class TestMock {

	@Test
	public void testListByMock() {
		// create a mock ExternalService (not really access it)
		ExternalService serviceTest = Mockito.mock(ExternalService.class);
		
		ServiceImp imp = new ServiceImp(serviceTest);
		// when sth is called, some value is returned 
		Mockito.when(imp.retrieveRelatedToSpring("dummy_data")).thenReturn(
				Arrays.asList("spring boot", "spring security", "rest api"));
		
		List<String> filteredWords = imp.retrieveRelatedToSpring("dummy_data");

		System.out.println(filteredWords); // [spring boot, spring security]
		assertEquals(2, filteredWords.size());
	}

}
