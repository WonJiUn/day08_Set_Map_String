package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : " + set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Object o = it.next();		
			//String s = (String)o;
			String s = (String)it.next();	//.next()의 결과값 : object 타입
			System.out.println(s);		
		}
		
		
		
		
	}
}
