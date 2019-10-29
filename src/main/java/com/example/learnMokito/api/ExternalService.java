package com.example.learnMokito.api;

import java.util.List;

// a fake external service
public interface ExternalService {

	public List<String> retrieveKeyWords(String name);
	
}
