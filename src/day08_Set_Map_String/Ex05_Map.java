package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();	//<int,String> 자료형 타입을 지정. 보통은 클래스가 들어옴
		String key = null, value = null;
		System.out.println("저장할 키 입력");
		key = input.next();
		System.out.println("저장할 값 입력");
		value = input.next();
		
		map.put(key,value);
		System.out.println(map);
		
		
	} 
	
}
