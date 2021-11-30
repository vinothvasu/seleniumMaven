package com.selenium.training;

import org.testng.annotations.Test;

public class TestNGAttributes3 {
	
	
	//priority - 
	//>=0 @test which does not have any priority - highest
	//<= @test which has a negative priority - highest
	//dependsonmethods
	//include & exclude methods
	//groups
	//include & exclude groups
	
	@Test(priority=1)
	public void ptest() {
		System.out.println("Test-P");
	}
	
	@Test(priority=1)
	public void qtest() {
		System.out.println("Test-Q");
	}
	
	@Test
	public void rtest() {
		System.out.println("Test-R");
	}
	
	@Test(priority=1)
	public void ttest() {
		System.out.println("Test-T");
	}
	
	

}
