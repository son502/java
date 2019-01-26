package data;
import java.lang.*;
public class test10 {
	public static void main(String[] args) {
		//logic : 판정을 위한 값
		//boolean a = 1; 불가능
		boolean a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		//System.out.println(a+b); 실행안됨
		
		//숫자를 이용한 논리 판정 구현
		int money = 10000;
		int pizza = 15000;
		boolean buy = money >= pizza;
		System.out.println(buy);
		
		//int money = 30000; -> TRUE 값이 나옴
		//int pizza = 15000;
		//boolean buy = money >= pizza;
		//System.out.println(buy);  
		
//1999년생이 성인이라면 TRUE 미성년자라면 FALSE 를 출력
		
		int year1 = 1999;
		int year2 = 1998;
		
		boolean result = year1<=year2;
				
		System.out.println(result);
		
	}
}
