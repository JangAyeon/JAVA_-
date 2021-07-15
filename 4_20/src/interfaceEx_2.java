
/*예제 5-7 : 인터페이스 구현 & 상속
 PhoneInterface 인터페이스를 구현하고 flash() 메소드를 추가한 SamsungPhone 클래스를 작성*/

interface PhoneInterface_1{ //인터페이스 선언
	final int TIMEOUT=1000; //상수 필드 선언
	void sendCall(); //추상
	void receiveCall(); 
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc_1{
	public int calculator(int x, int y) {
		return x+y;
	}
	
}

class SamsungPhone_1 extends Calc_1 implements PhoneInterface_1{ 
	public void sendCall() {
		System.out.println("띠리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	public void schedule() {
		System.out.println("일정관리합니다.");
	}
	
	
}


public class interfaceEx_2 {
	public static void main(String[] args) {
		SamsungPhone_1 phone=new SamsungPhone_1();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println("3과 5를 더하면 "+phone.calculator(3, 5));
		phone.schedule();
	}

}