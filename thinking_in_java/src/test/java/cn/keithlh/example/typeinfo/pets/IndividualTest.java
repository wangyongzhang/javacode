package cn.keithlh.example.typeinfo.pets;

import cn.keithlh.utils.Print;

public class IndividualTest {
	public static void main(String[] args) {
		Individual idd1 = new Individual();
		Individual idd2 = new Individual("compareTest");
		Individual idd3 = new Individual("compareTest");
		
		Print.print(idd1.id()+" : "+idd1.toString() +" : "+idd1.hashCode());
		Print.print(idd2.id()+" : "+idd2.toString() +" : "+idd2.hashCode());
		Print.print(idd3.id()+" : "+idd3.toString() +" : "+idd3.hashCode());
		
		Print.print();
		Print.print(idd1.compareTo(idd2));
		Print.print(idd2.compareTo(idd1));
		Print.print(idd2.compareTo(idd3));
		Print.print(idd3.compareTo(idd2));
		Print.print(idd2.compareTo(idd2));
	}
}
