
public class hello { // public : 권한
	//class 만들기
	
	public static int sum(int n, int m) { 
		//메소드
		// 덧셈 함수
		// 함수 이름 : sum, 인자 : 정수형 n과 m, int형 무언가가 출력됨
		// public : 권한, static : 강제/무조건 메모리 할당
		
		return n+m;
		
	}

	public static void main(String[] args) {
		//메소드
		// 반환 값이 없는 메인 함수, 문자형 args가 인자로 들어감
		// public : 권한, static : 자바가 메모리를 강제/무조건으로 할당 
		
		int i=20;
		int s;
		char a;
		
		s=sum(i,10); // 덧셈함수 호출 // 20+10=30
		a='?';
		System.out.println(a); // ? 출력
		System.out.println("Hello"); // Hello 출력
		System.out.println(s); // 정수 s값 출력
	
	
	}

}
