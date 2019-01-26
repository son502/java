package data;
import java.lang.*;

public class test05 {
	public static void main(String[] args) {
		//정수는 특별한 언급이 없으면 'int'로 사용
		//42억까지가 최대치 (+-를 반반씩 나누어 저장가능 그래서 최대치는 21억 정도임)
		//int는 정수를 표현하는 단위의 기본값.
		//int이름은 숫자가 안됨. 
		
	int a = 2100000000;
	System.out.println(a);
	//int b = 2200000000; //범위초가
	int c = 2100000000+100000000;
	System.out.println(c);
	int d = 1234567*1234567;
	System.out.println(d); //범위가 초가됨 -> long사용 (약 1800경까지 저장가능)
	long e = 1234567L*1234567L; //Long사용시 숫자 뒤에 'L'을 써야함. 그렇지 않으면 컴퓨터는 int로 인식
	System.out.println(e);
	long f = 2100000000L+1000000000L; //1~100만 사용할 때에는 더 작은 단위를 씀. 메모리사 사용되는 크기가 다르기 때문 
	System.out.println(f);
// 작은 숫자만 사용할 경우는  byte도 고려
	byte g = 10;
	System.out.println(g);
	//byte h = 128; //127까지 들어감 (-127~+127까지 저장)
	byte age = 10;
	//byte after = age+5; byte는 물리적인 파일을 다룰때 사용
	
		}
}
