package data;
import java.lang.*;
public class test10 {
	public static void main(String[] args) {
		//logic : ������ ���� ��
		//boolean a = 1; �Ұ���
		boolean a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		//System.out.println(a+b); ����ȵ�
		
		//���ڸ� �̿��� �� ���� ����
		int money = 10000;
		int pizza = 15000;
		boolean buy = money >= pizza;
		System.out.println(buy);
		
		//int money = 30000; -> TRUE ���� ����
		//int pizza = 15000;
		//boolean buy = money >= pizza;
		//System.out.println(buy);  
		
//1999����� �����̶�� TRUE �̼����ڶ�� FALSE �� ���
		
		int year1 = 1999;
		int year2 = 1998;
		
		boolean result = year1<=year2;
				
		System.out.println(result);
		
	}
}
