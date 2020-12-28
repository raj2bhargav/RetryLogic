package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	
	@Test(retryAnalyzer = com.analyzer.RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test(retryAnalyzer = com.analyzer.RetryAnalyzer.class)
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	
	

}
