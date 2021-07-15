
public class TypeConversion {
	public static void main(String[] args) {
		
		byte b = 127;
		int i=100;
		
		System.out.println(b+i); 
		//227 (int형으로 변환됨)
		System.out.println(10/4); 
		//2 (int형)
		System.out.println(10.0/4); 
		//10.0/4.0=2.5 (실수형)
		System.out.println((char)0x12340041); 
		//강제 변환 A
		System.out.println((byte)(b+i)); 
		//강제 변환 : 227을 byte형 크기만큼 자름
		System.out.println((int)2.9+1.8); 
		//강제 변환 : 2.9만 int형으로 바꿈, 2+1.8=3.8
		System.out.println((int)(2.9+1.8));
		//강제 변환 : 2.9+1.8한 것을 int형으로 바꿈, (int)4.7=4
		System.out.println((int)2.9+(int)1.8);
		//강제 변환 : 2.9와 1.8을 각각 int형으로 바꿈, 2+1=3
	}

}
