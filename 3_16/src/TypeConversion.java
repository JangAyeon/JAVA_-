
public class TypeConversion {
	public static void main(String[] args) {
		
		byte b = 127;
		int i=100;
		
		System.out.println(b+i); 
		//227 (int������ ��ȯ��)
		System.out.println(10/4); 
		//2 (int��)
		System.out.println(10.0/4); 
		//10.0/4.0=2.5 (�Ǽ���)
		System.out.println((char)0x12340041); 
		//���� ��ȯ A
		System.out.println((byte)(b+i)); 
		//���� ��ȯ : 227�� byte�� ũ�⸸ŭ �ڸ�
		System.out.println((int)2.9+1.8); 
		//���� ��ȯ : 2.9�� int������ �ٲ�, 2+1.8=3.8
		System.out.println((int)(2.9+1.8));
		//���� ��ȯ : 2.9+1.8�� ���� int������ �ٲ�, (int)4.7=4
		System.out.println((int)2.9+(int)1.8);
		//���� ��ȯ : 2.9�� 1.8�� ���� int������ �ٲ�, 2+1=3
	}

}
