package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		
		String str = new String("abcdefg");
		System.out.println(str.length());	//����
		System.out.println(str.charAt(2));	//(2)��° ���ڸ� ������
		
		str += "�ȳ��ϼ���";	//���ڿ� ������ �ڿ� �ٿ�����
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));	//���ڿ� ��ü�� true
		
		System.out.println(str.charAt(0) == 'a');	//���ڿ� �ڸ��߿� 1�� ��	true
		System.out.println(str.charAt(0) == 'c');	//false
		
		System.out.println(str.charAt(0) - 32);
		System.out.println((char)(str.charAt(0) - 32));		//�ƽ�Ű�ڵ�
	}
}
