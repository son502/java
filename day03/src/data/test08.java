package data;
import java.lang.*;
public class test08 {
/*A�л��� ���� ������ ������ ����
�ڹ� -75��
���̽�-80��

//Ǯ��: ��������
		System.out.println(75+80);//����
		System.out.println((75+80)/2);//���
		System.out.println((75+80)/2.0);//���
		System.out.println((75+80)/2.0f);//���
		
//���� ���

1.������ 2.�������*/
	public static void main(String[] args) {
		int java = 75;
		int python = 80;
		
		int total = java+python;
		
		double avg= total/2.0;
		double avg2 = total%2;
		//double avg= (double)total/2; //��ȯ����
		//double avg= total/(double)2;
		
		System.out.println(total);
		System.out.println(avg);
		System.out.println(avg2);
		

		
	}
}
