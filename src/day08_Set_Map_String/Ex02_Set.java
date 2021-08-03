package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		Iterator it = arr.iterator();
		//bof "일" "이" "삼" eof 순서로 데이터가 저장된다
		
		/*
		System.out.println(it.hasNext());	//bof 다음에 값이 존재하는가?
		System.out.println(it.next());		//bof 다음값을 꺼내와달라
		
		System.out.println(it.hasNext());	//일 다음에 값이 존재하는가?
		System.out.println(it.next());		//그 다음값을 꺼내와달라
		
		System.out.println(it.hasNext());	//이 다음에 값이 존재하는가?
		System.out.println(it.next());		//그 다음값을 꺼내와달라
		
		System.out.println(it.hasNext());	//이 다음에 값이 존재하는가? -> false
		//System.out.println(it.next());	//그 다음값을 꺼내와달라
		*/
		
		/*
		for(;;) {
			System.out.println(it.hasNext());
			if(it.hasNext() == true) {
				System.out.println(it.next());
			}
			else {
				break;
			}
		}
		*/
		
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		
		//ArrayList는 순서가 있기 때문에 int i = 0; i<arr.size();같은 방식으로 X번째 값을 꺼내오는게 가능하지만
		//Set은 순서가 없어서 이런 방식으로 값을 하나씩 꺼내와야 함
		//여러번 사용할 수 없다
		//set(16개의 공간을 미리 만들어놓고 데이터가 들어오면 아무데나 저장됨)
		//데이터가 임의의 공간에 저장되기 때문에 꺼내오기가 힘들다->iterator로 변환->데이터를 순서대로 정렬->데이터를 꺼내올 수 있음
		
		
		
		
	}
}
