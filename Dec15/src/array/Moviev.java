package array;

import java.util.Scanner;

public class Moviev {

	public static void main(String[] args) {
		int[] seat=new int[10];
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
		System.out.println("---------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i+1+" ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
		System.out.println("�Է� �¼� �Է� >>> ");
		System.out.println("����� 0�� �Է��ϼ���");
		System.out.print("�¼���ȣ >>> ");
		
		int number=input.nextInt();
		if(number==0) {
			System.out.println("���α׷��� �����");
			break;
		}
		if (seat[number-1]==0) {
			System.out.println("���� ������ �ڸ���");
			System.out.println("���Ÿ� �����մϴ�");
			seat[number-1]=1;
			System.out.println("���� �Ϸ��");
		}else {
			System.out.println("���� �Ұ����� �ڸ���");
			System.out.println("�ٸ� �¼��� �Է��ϼ���");
		}
		
		}
		
	}

}
