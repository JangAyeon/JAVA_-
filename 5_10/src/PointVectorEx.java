/*예제 7-2 : Point 클래스의 객체들만 저장하는 백터 만들기
 점 (x,y)를 표현하는 Point 클래스의 객체만 다루는 벡터의 활용을 보여라*/

import java.util.Vector;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";//(x,y) 출력
	}
	
	
}
public class PointVectorEx {
	public static void main(String[] args) {
		
		Vector <Point> v= new Vector<Point>();
		
		//3개의 Point 객체 타입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		//인덱스 1의 Point(-5,20) 객체 삭제
		v.remove(1);
		
		//벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0;i<v.size();i++) {
			Point p=v.get(i); //백터의 i번째 Point 객체 모두 검색하여 출력
			System.out.println(p); //p.toString()을 이용하여 객체 p 출력
		}
	}
}
