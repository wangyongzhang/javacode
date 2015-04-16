package cn.keithlh.utils;

public class PrintTest {

	public static void main(String[] args) {
		Print.print("Print Test");
		Print.print();
		Print.printnb("No line break Test:");
		Print.printnb(" This is The Test");
		Print.print("Printf Test:");
		double d = 345.678;
		String s = "Hello!";
		int i = 1234;
		//%表示格式化输出，%之后的表示格式的定义
		Print.printnb("%f : ");
		Print.printf("%f", d);		//表示格式化输出为浮点数
		Print.print();
		Print.printnb("%9.2f : ");
		Print.printf("%9.2f", d);	//9表示输出的长度，2表示小数点后的位数
		Print.print();
		Print.printnb("%+9.2f : ");
		Print.printf("%+9.2f", d);	//+表示输出的数带正负号
		Print.print();
		Print.printnb("%-9.2f : ");
		Print.printf("%-9.2f", d);	//-表示输出的数左对齐
		Print.print();
		Print.printnb("%+-9.2f : ");
		Print.printf("%+-9.2f", d);	//+-表示输出的数带正负号且左对齐
		Print.print();
		Print.printnb("%d : ");
		Print.printf("%d", i);		//表示输出十进制数
		Print.print();
		Print.printnb("%o : ");
		Print.printf("%o", i);		//表示输出八进制数
		Print.print();
		Print.printnb("%x : ");
		Print.printf("%x", i);		//表示输出十六进制数
		Print.print();
		Print.printnb("%#x : ");
		Print.printf("%#x", i);		//表示输出带有十六进制标志的整数
		Print.print();
		Print.printnb("%s : ");
		Print.printf("%s", s);		//表示字符串输出
	}
}
