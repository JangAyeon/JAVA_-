/*에제 6-1: Object 클래스로 객체 속성 알아내기
  Object 클래스를 이용하여 객체의 클래스명, 해시코드 값, 객체의 문자열을 출력*/

class Point_2{
	private int x,y;
	public Point_2(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point_2 p=new Point_2(2,3);
		System.out.println(p.getClass().getName()); //클래스 이름
		System.out.println(p.hashCode()); //해시 코드의 값
		System.out.println(p.toString()); //객체의 문자열
	}

}
