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
		System.out.println("입력 좌석 입력 >>> ");
		System.out.println("종료는 0을 입력하세요");
		System.out.print("좌석번호 >>> ");
		
		int number=input.nextInt();
		if(number==0) {
			System.out.println("프로그램이 종료됨");
			break;
		}
		if (seat[number-1]==0) {
			System.out.println("예매 가능한 자리임");
			System.out.println("예매를 진행합니다");
			seat[number-1]=1;
			System.out.println("예매 완료됨");
		}else {
			System.out.println("예매 불가능한 자리임");
			System.out.println("다른 좌석을 입력하세요");
		}
		
		}
		
	}

}
