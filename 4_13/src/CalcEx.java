/*전역 함수로 작성하고자 하는 abs, max, min의 3개 함수를 static 매소드를 작성하고 호출하는 사례*/

class Calc{
	public static int abs(int a) {return a>0? a:-a;}
	//public 선언, static으로 고정되어 사라지지 않고 main에서 부를 수 있음 = 전역으로 생성
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a,int b) {return (a>b)?b:a;}
}
public class CalcEx {
	
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3, -8));
	}

}
