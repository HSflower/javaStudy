package test;
import java.util.*;

import school.Login;

//��ü���� �񿬼������� �����ϴ� �������� - ����, ���߿� ���� ����
public class setTest {

	public static void main(String[] args) {
		Collection c;
		c = new HashSet();
		System.out.println(c.add("hello")); 
		//�ߺ����Ÿ� �ȵȴ� ���̶��? ���ð� ��������?
		//������ ����Ŭ�� �ݹ�
		
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234));
		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new Login("userid", "userpw")));
		
		System.out.println(c.add("hello")); 
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234));
		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new Login("userid", "userpw")));
		
		System.out.println(c);
	}

}
