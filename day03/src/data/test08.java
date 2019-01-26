package data;
import java.lang.*;
public class test08 {
/*A학생의 과목별 점수는 다음과 같다
자바 -75점
파이썬-80점

//풀이: 변수없이
		System.out.println(75+80);//총점
		System.out.println((75+80)/2);//평균
		System.out.println((75+80)/2.0);//평균
		System.out.println((75+80)/2.0f);//평균
		
//변수 사용

1.총점수 2.평균점수*/
	public static void main(String[] args) {
		int java = 75;
		int python = 80;
		
		int total = java+python;
		
		double avg= total/2.0;
		double avg2 = total%2;
		//double avg= (double)total/2; //변환연산
		//double avg= total/(double)2;
		
		System.out.println(total);
		System.out.println(avg);
		System.out.println(avg2);
		

		
	}
}
