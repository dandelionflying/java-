package jvm;

/**
 * @author dandelion 
 * intern()��������ַ����������в�ѯ��ǰ�ַ����Ƿ���ڣ��������ھͻὫ��ǰ�ַ�����ͼ��������
 */
public class StringIntern {
	public static void main(String[] args) {
		String s1 = new String("111111");
		//s = s.intern();
		s1.intern();
		String s2 = "111111";
		System.out.println(s1 == s2);// false,����Ӧ��true��
		
		String s3 = new String("1") + new String("1");
//		s3.intern();
		String s4 = "11";
		System.out.println(s3.intern() == s4);

	}
}
