package cn.keithlh.example.string;

import java.util.ArrayList;
import java.util.List;

import cn.keithlh.utils.Print;

public class InfiniteRecursionTest {

	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		Print.print(v.toString());
	}
}
