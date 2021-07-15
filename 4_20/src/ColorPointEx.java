class Point {
	private int x,y; //한 점을 구성하는 x,y좌표
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

//Point를 상속받은 ColorPoint
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx{ //컬러 점의 좌표 출력
	public static void main(String[] args) {
		Point p=new Point(); //Point 객체 생성
		p.set(1, 2); //Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4); //Point 클래스의 set() 호출
		cp.setColor("red"); //ColorPoint의 setColor() 호출
		cp.showPoint(); //컬러와 좌표 출력
	}
}
