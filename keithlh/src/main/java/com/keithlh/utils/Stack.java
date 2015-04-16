package com.keithlh.utils;

import java.util.LinkedList;

/**
 *@className Stack
 *@description	��LinkedListģ��Stack�Ĺ���ģʽ
 *	Stack����Ҫ���ص�����Ƚ����
 *	java.util.Stack ��ͨ���̳�Vectorʵ�ֵ���Ӧ���ܣ������������ʵ��
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
