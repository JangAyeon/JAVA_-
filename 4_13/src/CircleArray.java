/*Circle 객체 5개를 가지는 배열을 생성하고, 
 Circle 객체의 반지름을 0에서 4까지 각각 지정한 후,
 면적을 출력하라*/

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;//this 주의
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
public class CircleArray {
	
	public static void main(String[] args) {
		Circle[] c; //배열에 대한 레퍼런스 변수 선언
		c=new Circle[5]; //레퍼런스 배열 생성
		
		for (int i=0;i<c.length;i++) { //객체 생성
			c[i]=new Circle(i);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
	}

}
