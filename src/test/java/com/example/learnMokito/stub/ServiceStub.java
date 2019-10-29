package com.example.learnMokito.stub;

import java.util.Arrays;
import java.util.List;

import com.example.learnMokito.api.ExternalService;

// real implements, but provide fake data (test data)
public class ServiceStub implements ExternalService {

	@Override
	public List<String> retrieveKeyWords(String name) {
		return Arrays.asList("spring boot", "spring security", "rest api");
	}

}
