package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {
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
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				System.out.println("1.���� 2.���� 3.������");
				System.out.print(">>> ");
				select = sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("���� �޴��̸� �Է� : ");
					menu = sc.next();
					
					if(map.containsKey(menu) == false) {
						System.out.println("�޴��� �����ϴ�!!!");
						break;
					}
					else {
						System.out.print("���� ���� �Է� : ");
						String price2 = sc.next();
						
						System.out.println(map.get(menu) + "->" + price2);
						
						map.put(menu, price2);
						System.out.println("���� �ƽ��ϴ�!!!");
						break;
					}
					
				case 2:
					System.out.print("������ �޴��̸� �Է�: ");
					menu = sc.next();
					if(map.containsKey(menu) == false) {
						System.out.println("�޴��� �����ϴ�!!!");
						break;
					}
					else {
						map.remove(menu);
						System.out.println("�����Ǿ����ϴ�");
					break;
					}
				case 3:
					
					break;
				default : System.out.println("1~3�߿� �ϳ��� �Է����ּ���");
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
