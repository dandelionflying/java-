package operator;

public class Demo {
	public static void main(String[] args) {
		int a = 32;
//		int a1 = ++a + a++ + a++;//100
		int a2 = ++a + ++a + a++;
		System.out.println(a2);//101
		int i = -8;
		System.out.println(~i);//7
		/*
		 * ԭ��		0000 1000
		 * ����		0000 1000
		 * ����		0000 1000
		 * 	��λȡ��	1111 0111��~��
		 * תΪԭ�룺	
		 * ����ȡ��	1111 1000
		 * ĩλ��һ	1111 1001
		 * 
		 * ԭ��		1111 1000
		 * ����		1111 0111
		 * ����		1111 1000
		 * 	��λȡ��	0000 0111
		 * 	תΪԭ�룺
		 * 		����ԭ����һ��
		 * */
	}
}
