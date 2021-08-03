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
				Iterator it = map.keySet().iterator();	//맨 위에 작성하면 값이 저장되기 전이기 때문에 아무것도 출력되지 않음
				while(it.hasNext()) {
					String key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
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
