package array;

public class Number {

	public static void main(String[] args) {
		int[] i=new int[100];
		i[0]=100;
		i[55]=200;
		i[99]=300;
		
		System.out.println(i[0]);
		System.out.println(i[55]);
		System.out.println(i[99]);
		System.out.println(i.length);
		
		String[] s=new String[100];
		s[0]="hello";
		s[1]="java";
		s[99]="spring";
		
		System.out.println(s[0]+" "+s[1]+" "+s[99]);
		System.out.println(s.length);
	}

}
