package data;
import java.lang.*;

public class test02 {
	public static void main(String[] args) {
		//샐러드바 4인, 맥주 2병
		//샐러드바 1인 20,000원 맥주는 1병당 3000원
		//멤버쉽 포인트로 15,000원 할인
		System.out.println(20000 * 4 + 3000 * 2 - 15000);
		//(20000*4+3000*2) 중복되는 내용은 저장(변수 variable)
		System.out.println(20000 * 4 + 3000 * 2);
	}
}
