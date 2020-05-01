package com.abc.testngnew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesDemo {
	@Test
    public void function1() {
    	System.out.println("function1 is executed");//login
    	Assert.fail();//this fail this function method
    }
	@Test(dependsOnMethods="function1",alwaysRun=true)
    public void function2() {
    	System.out.println("function2 is executed");//inbox
    }
	//@Test(invocationCount=5)
	@Test(enabled=false)
    public void function3() {
		
    	System.out.println("function3 is executed");
    }
	
	
}
