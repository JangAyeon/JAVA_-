
/*예쩨 5-2 : super()를 활용한 colorpoint 작성
 : super()를 이용하여 ColorPoint 클래스의 생성자에서 서브 클래스 Point의 생성자를 호출하는 예시*/

class Point_1{
	private int x,y; //한점을 구성하는  x,y 좌표
	public Point_1() {
		this.x=0;
		this.y=0;
	}
	public Point_1(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint_1 extends Point_1{
	private String color; //점의 색
	public ColorPoint_1(int x, int y,String color) {
		super(x,y); //Point 생성자의 Point(x,y) 호출
		this.color=color;
	}
	public void showColorPoint() {//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point 클래스의 showPoint() 호출
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint_1 cp=new ColorPoint_1(5,6,"blue");
		cp.showColorPoint();
		
	}

}
