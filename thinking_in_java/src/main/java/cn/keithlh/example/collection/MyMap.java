package cn.keithlh.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyMap {

	public static Map<String,Integer> createMap(){
		Map<String,Integer> map = new HashMap<String,Integer>();
		Random ran = new Random(74);
		for(int i=0; i<10; i++){
			map.put(String.valueOf(i), ran.nextInt(20));
		}
		return map;
	}
	
	public static List<Integer> mapToList(Map<String,Integer> map){
		List<Integer> list = new ArrayList<Integer>();
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			list.add(map.get(it.next()));
		}
		
		return list;
	}
}
