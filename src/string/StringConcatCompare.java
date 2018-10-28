package string;

import java.util.ArrayList;

/**
 * @author dandelion
 *	�ַ���ƴ�����ַ�ʽ
 *	1����ͨ��ʽ 
 *	2.ʹ��concat������Ч���Ը�
 *	3.stringbuffer,Ч�ʸ�
 *	4.stringbuilderЧ�����
 *	5.���ArrayList�ķ���  StringUtil.join����
 */
public class StringConcatCompare {
	long start = 0;
	long end = 0;

	public StringConcatCompare() {

	}
	//	����������
	public void normalAdd() {
		start = System.currentTimeMillis();
		String s = null;
		for (int i = 0; i < 50000; i++) {
			s += i;
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	//	������ʹ��
	public void byConcat() {
		start = System.currentTimeMillis();
		String s2 = "";
		for (int i = 0; i < 50000; i++) {
			s2 = s2.concat(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void byStringBuilder() {
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 50000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public void byStringBuffer() {
		start = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 50000; i++) {
			buffer.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	
	// ���ArrayList�ķ���
	// StringUtils ��jdk�е��࣬��������Ϊ org.apache.commons.lang3.StringUtils
	public void byArrayListJoin() {
		/*start = System.currentTimeMillis();
		ArrayList list = new ArrayList();
		for(int i = 0; i < 50000; i++) {
			list.add(i);
		}
		StringUtils��join(list,"");
		
		end = System.currentTimeMillis();
		System.out.println(end - start);
		*/
	}
	
	
	public static void main(String[] args) {
		StringConcatCompare s = new StringConcatCompare();
		s.normalAdd();
		s.byConcat();
		s.byStringBuilder();
		s.byStringBuffer();
	}
}
