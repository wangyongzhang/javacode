package com.keithlh.utils;

import java.util.LinkedList;

/**
 *@className Stack
 *@description	用LinkedList模拟Stack的工作模式
 *	Stack最主要的特点就是先进后出
 *	java.util.Stack 是通过继承Vector实现的相应功能，是用数组操作实现
 *@author keithlh
 *@createDate 2015-4-15
 *
 */
public class Stack<T> {
	
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T v){ storage.addFirst(v); }
	
	public T peek(){	return storage.getFirst(); }
	
	public T pop(){	return storage.removeFirst(); }
	
	public boolean empty(){	return storage.isEmpty();	}
	
	public String toString(){	return storage.toString();	}
}
