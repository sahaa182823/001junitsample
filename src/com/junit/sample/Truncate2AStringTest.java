package com.junit.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Truncate2AStringTest {
	
	Truncate2AString t2as;

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
// AAAA => AA, ABCD=> BCD , BCDA=>BCD, AA=>"", AB=>B
	@Test
	public void testTruncateAInFirstTwoPositionPositive() {

		System.out.println("inside positive jUnit Test");
		
		//Arrange
		 
		
		//Arrange
		String expectedoutput ="B";
		
		String actualOutput ;
		
		
		//Act
		actualOutput = t2as.truncateAInFirstTwoPosition("AB");
		
		//Assert
		assertEquals(expectedoutput, actualOutput);
	}
	
	@BeforeClass
	public static void beforeEachJunitTestcase() {
		System.out.println("inside before");
		System.out.println("inside befor class");
	}
	
	@Before
	public void beforeEachJunitTest() {
		System.out.println("inside before");
		t2as = new Truncate2AString();
		System.out.println("instance created of Truncate2AString");
	}
	@After
	public void afterEachJunitTest() {
		System.out.println("Inside out");
		
	}

	@AfterClass
	public static void afterEachJunitTestcase() {
		System.out.println("Inside out of the class");
		
	}
	
	@Test(timeout=2)
	public void checkRandomNumberGenerator() {
		long randomNumbers[]= new long[100000];
		for(int i=0;i<100000;i++) {
			randomNumbers[i]=(long)Math.random();
		}
	}

}
