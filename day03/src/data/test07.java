package data;
import java.lang.*;
public class test07 {
	public static void main(String[] args) {
// �Ǽ� (�ε��Ҽ�����)
		
		double a = 3.14;
		//float b = 3.14;
		float b =3.14f;
		System.out.println(a);
		System.out.println(b);
		
		//�Ǽ��� Ư¡1: ǥ���� �� �ִ� �Ҽ��� �ڸ� ������ ����.
		double c = 1.123456767899912345;
		float d = 1.123456767899912345f; //�ִ� 7�ڸ�����
		System.out.println(c);
		System.out.println(d);
		
		//�Ǽ��� Ư¡2: �Ǽ��� ���Ե� ����� ������ �Ǽ��� ����
		System.out.println(10/3);//��
		System.out.println(10%3);//������
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		System.out.println(10.0/3);
	}
}
