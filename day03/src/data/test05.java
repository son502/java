package data;
import java.lang.*;

public class test05 {
	public static void main(String[] args) {
		//������ Ư���� ����� ������ 'int'�� ���
		//42������� �ִ�ġ (+-�� �ݹݾ� ������ ���尡�� �׷��� �ִ�ġ�� 21�� ������)
		//int�� ������ ǥ���ϴ� ������ �⺻��.
		//int�̸��� ���ڰ� �ȵ�. 
		
	int a = 2100000000;
	System.out.println(a);
	//int b = 2200000000; //�����ʰ�
	int c = 2100000000+100000000;
	System.out.println(c);
	int d = 1234567*1234567;
	System.out.println(d); //������ �ʰ��� -> long��� (�� 1800����� ���尡��)
	long e = 1234567L*1234567L; //Long���� ���� �ڿ� 'L'�� �����. �׷��� ������ ��ǻ�ʹ� int�� �ν�
	System.out.println(e);
	long f = 2100000000L+1000000000L; //1~100�� ����� ������ �� ���� ������ ��. �޸𸮻� ���Ǵ� ũ�Ⱑ �ٸ��� ���� 
	System.out.println(f);
// ���� ���ڸ� ����� ����  byte�� ���
	byte g = 10;
	System.out.println(g);
	//byte h = 128; //127���� �� (-127~+127���� ����)
	byte age = 10;
	//byte after = age+5; byte�� �������� ������ �ٷ궧 ���
	
		}
}
