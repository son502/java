package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] num=new int[5];
		
		for (int i = 0; i < num.length; i++) {
//			int num=input.nextInt();
			System.out.print("점수입력 >>> ");
			num[i]=input.nextInt(); 
			
		}
		for (int n:num) {
			System.out.println(n);
		}
		
		System.out.print("찾고 싶은 값 >>> ");
		int find=input.nextInt();
		for (int i = 0; i < num.length; i++) {
			if(num[i]==find) {
				System.out.println("위치는 : "+i);
			}
		}
			
		int max=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("최대값은 : "+max);
		}
}
