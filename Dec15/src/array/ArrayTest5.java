package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] num=new int[5];
		
		for (int i = 0; i < num.length; i++) {
//			int num=input.nextInt();
			System.out.print("�����Է� >>> ");
			num[i]=input.nextInt(); 
			
		}
		for (int n:num) {
			System.out.println(n);
		}
		
		System.out.print("ã�� ���� �� >>> ");
		int find=input.nextInt();
		for (int i = 0; i < num.length; i++) {
			if(num[i]==find) {
				System.out.println("��ġ�� : "+i);
			}
		}
			
		int max=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("�ִ밪�� : "+max);
		}
}
