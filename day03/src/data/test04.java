package data;
import java.lang.*;
public class test04 {
	public static void main(String[] args) {
	//int(변수)를 적극적으로 사용하여 test03을 개조
	//샐러드바 가격, 인원수, 맥주가격, 병수를 변수에 먼저 저장(가격은 언제든지 달라질 수 있음)
	int salad = 20000;
	int people = 4; //띄어 쓰기가 안되기 때문에 '_'로 사용 하거나 대문자를 활용
	int beer = 3000;
	int bottle = 2;
	int dis = 15000;
	int result = salad*people+beer*bottle;
	int total = result-dis;
	
	System.out.println(result);
	System.out.println(total);
	
	
	}
}
