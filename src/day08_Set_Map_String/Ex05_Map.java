package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();	//<int,String> �ڷ��� Ÿ���� ����. ������ Ŭ������ ����
		String key = null, value = null;
		System.out.println("������ Ű �Է�");
		key = input.next();
		System.out.println("������ �� �Է�");
		value = input.next();
		
		map.put(key,value);
		System.out.println(map);
		
		
	} 
	
}