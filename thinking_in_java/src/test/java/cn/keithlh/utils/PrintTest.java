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
		//%��ʾ��ʽ�������%֮��ı�ʾ��ʽ�Ķ���
		Print.printnb("%f : ");
		Print.printf("%f", d);		//��ʾ��ʽ�����Ϊ������
		Print.print();
		Print.printnb("%9.2f : ");
		Print.printf("%9.2f", d);	//9��ʾ����ĳ��ȣ�2��ʾС������λ��
		Print.print();
		Print.printnb("%+9.2f : ");
		Print.printf("%+9.2f", d);	//+��ʾ���������������
		Print.print();
		Print.printnb("%-9.2f : ");
		Print.printf("%-9.2f", d);	//-��ʾ������������
		Print.print();
		Print.printnb("%+-9.2f : ");
		Print.printf("%+-9.2f", d);	//+-��ʾ����������������������
		Print.print();
		Print.printnb("%d : ");
		Print.printf("%d", i);		//��ʾ���ʮ������
		Print.print();
		Print.printnb("%o : ");
		Print.printf("%o", i);		//��ʾ����˽�����
		Print.print();
		Print.printnb("%x : ");
		Print.printf("%x", i);		//��ʾ���ʮ��������
		Print.print();
		Print.printnb("%#x : ");
		Print.printf("%#x", i);		//��ʾ�������ʮ�����Ʊ�־������
		Print.print();
		Print.printnb("%s : ");
		Print.printf("%s", s);		//��ʾ�ַ������
	}
}
