package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		
		String str = new String("abcdefg");
		System.out.println(str.length());	//길이
		System.out.println(str.charAt(2));	//(2)번째 문자를 가져옴
		
		str += "안녕하세요";	//문자열 연산은 뒤에 붙여써줌
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg안녕하세요"));	//문자열 전체비교 true
		
		System.out.println(str.charAt(0) == 'a');	//문자열 자리중에 1개 비교	true
		System.out.println(str.charAt(0) == 'c');	//false
		
		System.out.println(str.charAt(0) - 32);
		System.out.println((char)(str.charAt(0) - 32));		//아스키코드
	}
}
