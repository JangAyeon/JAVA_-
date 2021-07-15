/*예제 6-2 : Point 클래스에 toString()작성
 Point 클래스에 Point 객체를 문자열로  리턴하는 toString() 메소드 작성*/

class Point{
	private int x,y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() { //Point 객체를 문자열로
		return "Point("+x+","+y+")";
	}
}


public class ToStringEx {
	public static void main(String[] args) {
		Point a=new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);//a는 a.to String()으로 자동변환됨
		}

}
