package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		
		String str = "   Have a nice day     ";
		String result = str.trim();			//문자열 앞뒤에 있는 공백 제거
		System.out.println("1." + str);
		System.out.println("2." + result);
		
		String inputId = "abcd    ";	//회원가입 할때와 로그인할때 아이디 비교시 공백때문에 문제가 생기는경우
		String saveId = "abcd";
		System.out.println(inputId);
		System.out.println(saveId);
		
		System.out.println(inputId.length());
		System.out.println(saveId.length());
		inputId = inputId.trim();
		System.out.println(inputId.equals(saveId));
		
		
		String[] split = result.split(" ");		//(" ")공백 을 기준으로 문자열을 자른다
		System.out.println(split[0]);	//Have
		System.out.println(split[1]);	//a
		System.out.println(split[2]);	//nice
		System.out.println(split[3]);	//day
		
		String addr = "101/서울시/종로구/종로3가 100번지/4층";
		String[] ad = addr.split("/");			//("/")를 기준으로 문자열 절단
		for(int i = 0; i<ad.length;i++) {
			System.out.println(ad[i]);
		}
		
		
		String replace = result.replace(" ", "+++");	//result문자열의 공백을 특정문자로 변경(치환)
		System.out.println(replace);
		
		
		
	}
}
