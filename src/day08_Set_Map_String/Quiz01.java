package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		String menu = null, price = null;
		int select;
		
		
		Boolean bool = true;
		
		while(bool) {
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.print(">>> ");
			select = sc.nextInt();
			switch(select) {
			case 1 : 
				System.out.print("�޴� �Է� : ");
				menu = sc.next();
				
				if(map.containsKey(menu) == true) {
					System.out.println("�����ϴ� �޴��Դϴ�");
					break;
				}
				else {
					System.out.print("���� �Է� : ");
					price = sc.next();
					
					map.put(menu, price);
					System.out.println("��� �Ǿ����ϴ�");
				}
				break;
				
			case 2 :
				Iterator it = map.keySet().iterator();	//�� ���� �ۼ��ϸ� ���� ����Ǳ� ���̱� ������ �ƹ��͵� ��µ��� ����
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				
				break;
			case 3 :
				bool = false;
				break;
			default : System.out.println("1~3�߿� �ϳ��� �Է����ּ���"); 
			}
		}
		
		System.out.println("���α׷��� �����մϴ�");
		
		
	}
}
