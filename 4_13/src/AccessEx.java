/*다음 코드의 두 클래스 Sample과 AccessEx 클래스는 동일한 패키지에 저장된다. 컴파일 오류를 찾아내고 이유를 설명하라*/
class Sample { //default 클래스
	public int a;
	private int b;
	int c; //default 변수

}

public class AccessEx{
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a=10; //호출됨
		aClass.b=10; //private이라서 동일 class내에서만 호출 가능
		aClass.c=10; //호출 가능
		
	}
}