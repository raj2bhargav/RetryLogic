package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void test4() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(true, true);
	}

}
