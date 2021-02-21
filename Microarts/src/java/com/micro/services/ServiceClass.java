package com.micro.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	AddInterface ai = new AddImpl();
	
	public int FirstMethod() {
		
		System.out.println("Im there");
		
		
		int c = ai.add();
		
		System.out.println("Im c: "+ c);
		
		return c;
	}

}
