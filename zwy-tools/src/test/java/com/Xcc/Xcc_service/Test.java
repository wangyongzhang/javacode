package com.Xcc.Xcc_service;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int a =0x0010;
		int b =0x0001;
		System.out.println("a : "+Integer.toBinaryString(a));
		System.out.println("b : "+Integer.toBinaryString(b));
		System.out.println("a^b : "+Integer.toBinaryString(a^b));
		System.out.println("a^=b : "+Integer.toBinaryString(a^=b));
		System.out.println("a&b : "+Integer.toBinaryString(a&b));
		System.out.println("a&=b : "+Integer.toBinaryString(a&=b));
		System.out.println("a|b : "+Integer.toBinaryString(a|b));
		System.out.println("a|=b : "+Integer.toBinaryString(a|=b));
		System.out.println("~a : "+Integer.toBinaryString(~a));
		System.out.println("~b : "+Integer.toBinaryString(~b));
	}
	
	static int j = 6;
	
	public void staticVTest(){
		final int i=5;
	}
}
