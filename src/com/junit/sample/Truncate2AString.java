package com.junit.sample;

import org.junit.After;
import org.junit.Before;

public class Truncate2AString {
	
	//hare i will define the method which 
	//will truncate AA if present in the 
	//first 2 position of the input string.
	
	public String truncateAInFirstTwoPosition(String str) {
		//here will go the business logic
		String newStr = "";
		
		String firstTwoCharecters = str.substring(0,2);
		String stringExcludingFirstTwoCharecters = str.substring(2);
		
		newStr = firstTwoCharecters.replaceAll("A","") + stringExcludingFirstTwoCharecters; 
		System.out.println(newStr);
		//newStre is the string after truncating first 2 A
		return newStr;
	}
	
	
	

}
