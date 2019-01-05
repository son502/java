package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("★두수를 입력해 주세요★");
		System.out.print("첫번째 수를 입력하세요 : >>> ");
		int input1=sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : >>> ");
		int input2=sc.nextInt();
		
		Cal2 cal3=new Cal2();
		int result=cal3.myCal(input1,input2);

		System.out.println("계산 결과는 : "+(result*100)+"입니다.");
	}

}
