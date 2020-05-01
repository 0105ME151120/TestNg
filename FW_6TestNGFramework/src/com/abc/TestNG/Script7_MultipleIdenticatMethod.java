package com.abc.TestNG;

import org.testng.annotations.Test;

public class Script7_MultipleIdenticatMethod {
           @Test(priority=1)
           public void a_Method() {
        	   System.out.println("a_Method executed");
           }
           @Test(priority=500)
           public void z_Method() {
        	   System.out.println("z_Method executed");
           }
           @Test(priority=1)
           public void e_Method() {
        	   System.out.println("e_Method executed");
           }
           @Test(priority=100)
           public void k_Method() {
        	   System.out.println("k_Method executed");
           }
}
