package com.selenium.training;

import org.testng.annotations.Test;

public class TestNGAttributes2 {
	
	
	//priority - 
	//>=0 @test which does not have any priority - highest
	//<= @test which has a negative priority - highest
	//dependsonmethods
	//include & exclude methods
	//enabled = false
	//groups
	//include & exclude groups
	
	
	@Test(groups = {"homepage", "regression"})
	public void test() throws Exception {
		System.out.println("test");
		//throw new Exception("no such element");
	}
	
	@Test(groups = {"homepage"})
	public void signup() {
		System.out.println("sign-up");	
	}
	
	
	@Test(groups = {"smoke", "regression"})
	public void login() {
		System.out.println("login");
	}
	
	

}
