package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="±è¾¾";
		names[1]="ÀÌ¾¾";
		names[2]="¹Ú¾¾";
		names[3]="È«¾¾";
		names[4]="°­¾¾";
		
		System.out.println(names.length);
		System.out.println(names[names.length-1]);
		
	}

}
