package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;


public class Ex04_Map {
	public static void main(String[] args) {
		
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable...���
		 
		 HashMap
		 - Ű�� ���� ���̴�
		 - ������ �������� �ʴ´�
		 - Ű������ �ߺ��� ������� �ʴ´�(���� �ߺ��� ���)
		 */
		
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();	//�������� ����
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));	//Ű�� �ߺ��� ������� �ʱ� ������ �̷������� �������°��� ����
		System.out.println(map.get("�ڵ���"));	
		System.out.println(map.get("������"));	
		System.out.println(map.get("����Ű"));	//�ش�Ű�� ������ null
		
		System.out.println(map.containsKey("������"));	//�ش��ϴ� Ű�� �����ϴ°�? ������ true ������ false
		System.out.println(map.containsKey("������111"));
		
		System.out.println(map.containsValue("30����"));	//�ش��ϴ� ���� �����ϴ°�? ������ true ������ false
		System.out.println(map.containsValue("31����"));
		
		System.out.println(map.remove("������"));			//�� ����
		System.out.println(map.containsKey("������"));
		System.out.println(map);
		
		System.out.println(map.keySet());	//set�̶�� �ڷ������� ������->Iterator�� 
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
}
