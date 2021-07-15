package pack_1;

//두개의 생성자를 가진 Circle 클래스를 만들어 보라
public class Circle {
	int radius;
	String name;
	
	//생성자 이름은 클래스 이름과 동일 & 생성자는 리턴 타입 없음
	public Circle() { //매개 변수 없는 생성자
		radius=1; // radius 초기값은 1
		name="";
	}
	
	public Circle(int r, String n) {//매개 변수를 가진 생성자
		radius=r;//받은 인자 r 그대로 radius 값으로
		name=n; //받은 인자 n 그대로 name 값으로
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza=new Circle(10,"자바피자");//Circle 객체 생성, 반지름 10
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 " +area);
		
		Circle donut=new Circle(); //Circle 객체 생성, 반지름 1
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}

