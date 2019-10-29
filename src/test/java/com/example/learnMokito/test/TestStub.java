package com.example.learnMokito.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.learnMokito.api.ExternalService;
import com.example.learnMokito.api.ServiceImp;
import com.example.learnMokito.stub.ServiceStub;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStub {

	@Test
	public void usingStubToTestRelatedToSpring() {
		
		ExternalService serviceTest = new ServiceStub();
		ServiceImp imp = new ServiceImp(serviceTest);
		List<String> filteredWords = imp.retrieveRelatedToSpring("dummy_data");
		
		System.out.println(filteredWords);    // [spring boot, spring security]
		assertEquals(2, filteredWords.size());
		
	}
	
	
	@Test
	public void usingStubToTestNoTRelatedToSpring() {
		
		ExternalService serviceTest = new ServiceStub();
		ServiceImp imp = new ServiceImp(serviceTest);
		List<String> filteredWords = imp.retrieveRelatedToSpring("dummy_data2");
		
		System.out.println(filteredWords);    // [rest api]
		assertEquals(1, filteredWords.size());
		
	}
	
	
}
