package com.example.learnMokito.api;

import java.util.ArrayList;
import java.util.List;

// fake Service Implementation 
public class ServiceImp {

	private ExternalService es;

	// use constructor to do connection (fake implementation)
	public ServiceImp(ExternalService service) {
		this.es = service;
	}

	public List<String> retrieveRelatedToSpring(String name) {
		List<String> ret = new ArrayList<>();
		List<String> all = es.retrieveKeyWords(name);

		if ((name.equals("dummy_data"))) {
			for (String s : all) {
				if (s.contains("spring"))
					ret.add(s);
			}
		}
		else if((name.equals("dummy_data2"))) {
			for (String s : all) {
				if (!s.contains("spring"))
					ret.add(s);
			}
		}

		return ret;
	}

}
