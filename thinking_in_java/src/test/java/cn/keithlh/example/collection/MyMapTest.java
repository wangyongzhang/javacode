package cn.keithlh.example.collection;

import java.util.List;
import java.util.Map;

import cn.keithlh.utils.Print;

public class MyMapTest {

	public static void main(String[] args) {
		Map<String,Integer> map = MyMap.createMap();
		Print.print(map);
		List<Integer> list = MyMap.mapToList(map);
		Print.print(list);
	}
}
