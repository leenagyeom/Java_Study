package ch03;

public class StringTest3 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));	// ������ �ؽ��ڵ� ����
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));	// ������ �ؽ��ڵ� ����
		
		String test = buffer.toString();
		System.out.println(test);

	}
}
