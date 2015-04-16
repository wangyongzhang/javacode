package cn.keithlh.example;

import java.util.Stack;

public class StaticValueTest {

	private static int itest = 0;
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		for(int i=0; i<10; i++ ){
			System.out.println(itest++);
		}
	}
}
