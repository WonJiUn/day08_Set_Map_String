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
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			select = sc.nextInt();
			switch(select) {
			case 1 : 
				System.out.print("메뉴 입력 : ");
				menu = sc.next();
				
				if(map.containsKey(menu) == true) {
					System.out.println("존재하는 메뉴입니다");
					break;
				}
				else {
					System.out.print("가격 입력 : ");
					price = sc.next();
					
					map.put(menu, price);
					System.out.println("등록 되었습니다");
				}
				break;
				
			case 2 :
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.print(">>> ");
				select = sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("변경 메뉴이름 입력 : ");
					menu = sc.next();
					
					if(map.containsKey(menu) == false) {
						System.out.println("메뉴가 없습니다!!!");
						break;
					}
					else {
						System.out.print("수정 가격 입력 : ");
						String price2 = sc.next();
						
						System.out.println(map.get(menu) + "->" + price2);
						
						map.put(menu, price2);
						System.out.println("변경 됐습니다!!!");
						break;
					}
					
				case 2:
					System.out.print("삭제할 메뉴이름 입력: ");
					menu = sc.next();
					if(map.containsKey(menu) == false) {
						System.out.println("메뉴가 없습니다!!!");
						break;
					}
					else {
						map.remove(menu);
						System.out.println("삭제되었습니다");
					break;
					}
				case 3:
					
					break;
				default : System.out.println("1~3중에 하나를 입력해주세요");
				}
				break;
			case 3 :
				bool = false;
				break;
			default : System.out.println("1~3중에 하나를 입력해주세요"); 
			}
		}
		
		System.out.println("프로그램을 종료합니다");
		
		
		
		
	}
}
