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
		 - HashTable...등등
		 
		 HashMap
		 - 키와 값의 쌍이다
		 - 순서는 유지되지 않는다
		 - 키에대한 중복은 허용하지 않는다(값의 중복은 허용)
		 */
		
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();	//순서유지 가능
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));	//키의 중복을 허용하지 않기 때문에 이런식으로 가져오는것이 가능
		System.out.println(map.get("자동차"));	
		System.out.println(map.get("에어컨"));	
		System.out.println(map.get("없는키"));	//해당키가 없으면 null
		
		System.out.println(map.containsKey("에어컨"));	//해당하는 키가 존재하는가? 있으면 true 없으면 false
		System.out.println(map.containsKey("에어컨111"));
		
		System.out.println(map.containsValue("30만원"));	//해당하는 값이 존재하는가? 있으면 true 없으면 false
		System.out.println(map.containsValue("31만원"));
		
		System.out.println(map.remove("에어컨"));			//값 삭제
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map);
		
		System.out.println(map.keySet());	//set이라는 자료형으로 돌려줌->Iterator로 
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
}
