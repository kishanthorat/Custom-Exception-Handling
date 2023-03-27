package com.custom.exception;

public class Test {
	
	public void m1(int age) throws InvalidAgeException
	{
		if(age<=0)
			 throw new InvalidAgeException("Age Invalid");
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		try {
		   t.m1(-5);
		}
		catch (InvalidAgeException e) {
//		   e.printStackTrace();
			System.out.println("Exception "+e);
		}
		System.out.println("Task Done By K.P.Thorat");
	}

}
