package com.abc.TestNG;

import org.testng.annotations.Test;

public class Script6_WithPriority {
        @Test(priority=101)
        public void a_method() {
        	System.out.println("a_Method executed");
        }
        @Test(priority=1)
        public void b_method() {
        	System.out.println("b_Method executed");
        }
        @Test(priority=98)
        public void c_method() {
        	System.out.println("c_Method executed");
        }
        @Test(priority=5)
        public void d_method() {
        	System.out.println("d_Method executed");
        }
        @Test(priority=101)
        public void e_method() {
        	System.out.println("e_Method executed");
        }
}
