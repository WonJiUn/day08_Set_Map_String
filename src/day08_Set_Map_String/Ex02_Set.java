package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();
		//bof "��" "��" "��" eof ������ �����Ͱ� ����ȴ�
		
		/*
		System.out.println(it.hasNext());	//bof ������ ���� �����ϴ°�?
		System.out.println(it.next());		//bof �������� �����ʹ޶�
		
		System.out.println(it.hasNext());	//�� ������ ���� �����ϴ°�?
		System.out.println(it.next());		//�� �������� �����ʹ޶�
		
		System.out.println(it.hasNext());	//�� ������ ���� �����ϴ°�?
		System.out.println(it.next());		//�� �������� �����ʹ޶�
		
		System.out.println(it.hasNext());	//�� ������ ���� �����ϴ°�? -> false
		//System.out.println(it.next());	//�� �������� �����ʹ޶�
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
		
		//ArrayList�� ������ �ֱ� ������ int i = 0; i<arr.size();���� ������� X��° ���� �������°� ����������
		//Set�� ������ ��� �̷� ������� ���� �ϳ��� �����;� ��
		//������ ����� �� ����
		//set(16���� ������ �̸� �������� �����Ͱ� ������ �ƹ����� �����)
		//�����Ͱ� ������ ������ ����Ǳ� ������ �������Ⱑ �����->iterator�� ��ȯ->�����͸� ������� ����->�����͸� ������ �� ����
		
		
		
		
	}
}
