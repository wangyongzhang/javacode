package cn.keithlh.example;

public class StaticValueTest {

	private static int itest = 0;
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++ ){
			System.out.println(itest++);
		}
	}
}
