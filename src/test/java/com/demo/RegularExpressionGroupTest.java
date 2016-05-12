package com.demo;

import org.testng.annotations.Test;

public class RegularExpressionGroupTest 
{
	    @Test(groups = { "include-test-one" })
	    public void testMethodOne() {
	        System.out.println("RegularExpressionGroupTest  : Test method one");
	    }
	 
	    @Test(groups = { "include-test-two" })
	    public void testMethodTwo() {
	        System.out.println("RegularExpressionGroupTest  : Test method two");
	    }
	 
	    @Test(groups = { "test-one-exclude" })
	    public void testMethodThree() {
	        System.out.println("RegularExpressionGroupTest  : Test method three");
	    }
	 
	    @Test(groups = { "test-two-exclude" })
	    public void testMethodFour() {
	        System.out.println("RegularExpressionGroupTest  :Test method Four");
	    }
}
