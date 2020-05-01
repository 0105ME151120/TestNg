package com.abc.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Script2 {
        @BeforeMethod
        public void beforeMethod() {
        	System.out.println("Before method executed");
        }
        @AfterMethod
        public void afterMethod() {
        	System.out.println("After method executed");
        }
        @Test
        public void testcase1() {
        	System.out.println("Testcase1 executed");
        }
        @Test
        public void testcase2() {
             	System.out.println("Testcase2 executed");
        }
        @Test
        public void testcase3() {
             	System.out.println("Testcase3 executed");
        }
        @Test
        public void testcase4() {
             	System.out.println("Testcase4 executed");
        }
        @Test
        public void testcase5() {
             	System.out.println("Testcase5 executed");
        }
        
}

