package data;
import java.lang.*;
public class test07 {
	public static void main(String[] args) {
// 실수 (부동소수점수)
		
		double a = 3.14;
		//float b = 3.14;
		float b =3.14f;
		System.out.println(a);
		System.out.println(b);
		
		//실수의 특징1: 표시할 수 있는 소수점 자리 제한이 존재.
		double c = 1.123456767899912345;
		float d = 1.123456767899912345f; //최대 7자리까지
		System.out.println(c);
		System.out.println(d);
		
		//실수의 특징2: 실수가 포함된 계산은 무조건 실수가 나옴
		System.out.println(10/3);//몫
		System.out.println(10%3);//나머지
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		System.out.println(10.0/3);
	}
}
