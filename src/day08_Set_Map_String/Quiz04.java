package day08_Set_Map_String;

public class Quiz04 {
	public static void main(String[] args) {
		
		String str = new String("�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��");
		
		System.out.println("====���� �� str====\n" + str);
		
		String replacearr = str.replace("-",":");
		String[] splitarr = replacearr.split("\n");
		str = "";
		
		
		for(int i = 0; i<splitarr.length; i++) {
			String[] reSplit = splitarr[i].split(":");
			reSplit[1] = reSplit[1].replace(reSplit[1], "1999��");
			str += (reSplit[0] + ":" + reSplit[1] + "\n");
		}
		System.out.println("====���� �� str====\n" + str);
	}
}
