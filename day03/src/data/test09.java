package data;
import java.lang.*;

public class test09 {
	public static void main(String[] args) {
		/*문제
		 2시간 50분+ 1시간 45분 = ?시간 ?분 */
		
		int time = 170 + 105;
		int hour = time/60;
		int min = time%60;
		System.out.println(hour);
		System.out.println(min);
		
		//풀이(변수사용)
		/* int hour1 = 2, int min1 = 50;
		   int hour20 = 1, int min2 = 45;
		   
		  분으로 변환
		   int time1 = hour1*60 + min1;
		   int time2 = hour2*60 + min2;
		  합산
		   int time = time1+time2;
		  
		  시간변환
		 	int hour = time/60
		 	int min = time%60
		 	
		   System.out.println(hour);
		   System.out.println(min);
		   
		   
		 */
	
	}
}
