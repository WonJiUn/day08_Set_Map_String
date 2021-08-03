package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz03 {
	public static void main(String[] args) {
		
		//a의 위치 저장
		String str1 = new String("Have a nice day Have a nice day Have a nice day");
		ArrayList arr = new ArrayList();
		
		
		for(int i = 0; i<str1.length(); i++) {
			if(str1.charAt(i) == 'a') {
				arr.add(i);
			}
			
		}
		System.out.println("결과 : " + arr);
		
		
		
		//a의 개수와 g의 개수와 총개수
		
		String str2 = new String("It is a fun java programming");
		int a = 0, g = 0, tot = 0;
		
		for(int i = 0; i<str2.length(); i++) {
			if(str2.charAt(i) == 'a') {
				a++;
			}
			else if(str2.charAt(i) == 'g') {
				g++;
			}
		}
		
		System.out.println("총 개수 : " + str2.length());
		System.out.println("a 개수 : " + a);
		System.out.println("g 개수 : " + g);
		
		
		//첫번째 알파벳만 대문자로변경
		
		String str = new String("tESt sTring    change    first");
		String changeStr = new String();
		
		int k= 0;
		str = str.toLowerCase();
		
		
		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
			changeStr += (char)(str.charAt(k)-32);
			k++;
		}
		
		while(k<str.length()) {
			if(str.charAt(k) != ' ') {
				changeStr += str.charAt(k);
				k++;
				continue;
			}
			while(str.charAt(k) == ' ') {
				changeStr += str.charAt(k);
				k++;
			}
				
			if(str.charAt(k) >= 'a' && str.charAt(k)<='z') 
				changeStr += (char)(str.charAt(k)-32);
			
			k++;
					
				
		}
		
		System.out.println("변경 전 : " + str);
		System.out.println("변경 후 : " + changeStr);
		System.out.println("종료");
		
	}
}
