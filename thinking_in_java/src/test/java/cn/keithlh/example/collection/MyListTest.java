package cn.keithlh.example.collection;

import java.util.List;

import cn.keithlh.utils.Print;

public class MyListTest {

	public static void main(String[] args) {
		List<Integer> list = MyList.getIntList();
		Print.print(list);
		list = list.subList(0, 1);
		Print.print(list);
	}
}
