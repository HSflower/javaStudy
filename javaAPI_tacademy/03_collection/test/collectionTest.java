package test;
import java.util.*;

import school.Login;

//��ü���� �񿬼������� �����ϴ� �������� - ����, ���߿� ���� ����
public class collectionTest {

	public static void main(String[] args) {
		//<Login>�̶�� ��������� ����� ����� �ؾ�������, 7�������� ����Ҷ��� ��������ʾƵ� ������.
		System.out.println(new CollectionTest().getObjects(new ArrayList<Login>()));
		Collection<Login> set = new CollectionTest().getObjects(new HashSet());	
		for (Login tmp : set) {
			System.out.println(tmp.getLoginId()); //toString : ���ʿ��Ѱ��ʿ�
		} //foreach
	}
	
	//print - Collection<Element> : VO
	Collection<Login> getObjects(Collection<Login> c){

		Collection<Login> result = c;
		//c = new HashSet();
		//System.out.println(c.add("hello")); 
		//�ߺ����Ÿ� �ȵȴ� ���̶��? ���ð� ��������?
		//������ ����Ŭ�� �ݹ�
		// hashcode, equals �߰��ϴ� �۵� 
//		System.out.println(c.add(new String("hello")));
//		System.out.println(c.add(1234));
//		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new Login("userid", "userpw")));
		
//		System.out.println(c.add("hello")); 
//		System.out.println(c.add(new String("hello")));
//		System.out.println(c.add(1234));
//		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new Login("userid", "userpw")));

		return result;

	}
}
