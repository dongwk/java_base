package com.map_test;

import org.junit.Test;

public class MapKeyHashCodeTest {

	@Test
	public void testHashCode(){
		MapKeyHashCodeTest t = new MapKeyHashCodeTest();
		System.out.println(t.hashCode());
		System.out.println(t.hashCode() >>> 16);
	}
	
	@Test
	public void testIntegerHashCode(){
		Integer i1 = new Integer(1222);
		Integer i2 = new Integer(1222);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()+" - "+i2.hashCode());
	}
}
