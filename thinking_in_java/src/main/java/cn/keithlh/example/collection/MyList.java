package cn.keithlh.example.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {

	public static List<Integer> getIntList(){
		List<Integer> list = new ArrayList<Integer>();
		Random ran = new Random(74);
		for(int i=0; i<10; i++){
			list.add(ran.nextInt(20));
		}
		return list;
	}
}
