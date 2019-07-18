package com.hcl;

import junit.framework.TestCase;

public class MyMathClassTest extends TestCase {
	
	
	/**
     * Rigourous Test :-)
     */
    public void testMyMathClass() {
    	MyMathClass test = new MyMathClass();
    	int x = 10, y = 5;
        assertTrue( 50 ==  test.mutiplication(x, y));
    }
    
    /*public void testMyMathClass2() {
    	MyMathClass test = new MyMathClass();
    	int x = 10, y = 5;
        assertTrue( 45 ==  test.mutiplication(x, y));
    }*/

}
