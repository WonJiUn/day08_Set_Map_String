package day08_Set_Map_String;

public class Ex08_String {
	public static void main(String[] args) {
		
		String str = "Java is Easy. �׸��� programming �Ҹ��ϴ�";
		System.out.println("�⺻ : " + str);
		String changeStr = new String();
		changeStr = str.toUpperCase();				//�빮�ڷκ���
		System.out.println("��ȯ : " + changeStr);
		changeStr = str.toLowerCase();				//�ҹ��ڷκ���
		System.out.println("��ȯ : " + changeStr);
		
		
		
	}
}
