package demo1;



/**
 * @author dandelion
 *
 * ������㽻��������ֵ
 */
public class WeiYunsuan {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a:" +a+"\tb:" +b);
	}
}
