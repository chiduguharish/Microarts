package com.micro.services;

public class AddImpl implements AddInterface{

	

	public int add() {
		
		System.out.println("Im in");
		
		int c = 1+6;
		
		return c;
	}
	
}
