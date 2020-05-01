package com.abc.testngnew;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestDemo {
         @BeforeTest
         public void beforeTest() {
        	 System.out.println("before test");
         }
         @AfterTest
         public void afterTest() {
        	 System.out.println("after test");
         }
         @BeforeClass
         public void beforeClass() {
        	 System.out.println("before class");
         }
         @AfterClass
         public void afterClass() {
        	 System.out.println("after class");
         }
         @BeforeMethod
         public void beforeMethod() {
        	 System.out.println("beforeMethod executed");
         }
         @AfterMethod
         public void afterMethod() {
        	 System.out.println("afterMethod executed");
         }
         @Test
         public void Test1() {
        	 System.out.println("Test1 executed");
         }
     @Test
      public void Test2() {
	 System.out.println("Test2 executed");
}
}

