package day08_Set_Map_String;

public class Quiz04 {
	public static void main(String[] args) {
		
		String str = new String("김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년");
		
		System.out.println("====변경 전 str====\n" + str);
		
		String replacearr = str.replace("-",":");
		String[] splitarr = replacearr.split("\n");
		str = "";
		
		
		for(int i = 0; i<splitarr.length; i++) {
			String[] reSplit = splitarr[i].split(":");
			reSplit[1] = reSplit[1].replace(reSplit[1], "1999년");
			str += (reSplit[0] + ":" + reSplit[1] + "\n");
		}
		System.out.println("====변경 후 str====\n" + str);
	}
}
