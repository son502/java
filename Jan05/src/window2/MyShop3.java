package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("�ڵμ��� �Է��� �ּ����");
		System.out.print("ù��° ���� �Է��ϼ��� : >>> ");
		int input1=sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : >>> ");
		int input2=sc.nextInt();
		
		Cal2 cal3=new Cal2();
		int result=cal3.myCal(input1,input2);

		System.out.println("��� ����� : "+(result*100)+"�Դϴ�.");
	}

}
