package data;
import java.lang.*;
public class test04 {
	public static void main(String[] args) {
	//int(����)�� ���������� ����Ͽ� test03�� ����
	//������� ����, �ο���, ���ְ���, ������ ������ ���� ����(������ �������� �޶��� �� ����)
	int salad = 20000;
	int people = 4; //��� ���Ⱑ �ȵǱ� ������ '_'�� ��� �ϰų� �빮�ڸ� Ȱ��
	int beer = 3000;
	int bottle = 2;
	int dis = 15000;
	int result = salad*people+beer*bottle;
	int total = result-dis;
	
	System.out.println(result);
	System.out.println(total);
	
	
	}
}
