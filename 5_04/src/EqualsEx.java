/*예제 6-3 : Point 클래스의 equals() 작성
  Point 클래스에 x,y 점 좌표가 같으면 true를 return하는 equals()를 작성하라
 */

class Point_3{
	int x,y;
	public Point_3(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		Point_3 p=(Point_3)obj;
		if((x==p.x)&&(y==p.y)) return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point_3 a=new Point_3(2,3);
		Point_3 b=new Point_3(2,3);
		Point_3 c=new Point_3(3,4); 
		//a,b,c는 모두 다른 객체임
		//a,b에 담긴 내용물.. 숫자는 같음
		if (a==b) System.out.println("a==b"); 
		//==는 객체의 레퍼런스까지 비교함으로 서로 다른 객체여서 작동 안함
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		//.equals는 객체 안의 내용물..값..만 비교하기 때문에 a와 b가 같다고 말함
	}

}
