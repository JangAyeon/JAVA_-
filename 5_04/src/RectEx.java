/*예제 6-4 : Rect 클래스와 equals()메소드 만들기 연습
 int 타입의 width(너비), height(높이) 필드를 가지는 Rect클래스를 작성하고, 
 면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성해라*/

class Rect{
	private int width,height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Object obj) {
		Rect p=(Rect)obj;
		if (width*height==p.width*p.height) return true;
		else return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect a=new Rect(2,3); //면적 6
		Rect b=new Rect(3,2); //면적 6
		Rect c=new Rect(3,4); //면적 12
		
		if(a.equals(b)) System.out.println("a is equals to b");
		if(a.equals(c)) System.out.println("a is equals to c");
		if(b.equals(c)) System.out.println("b is equals to b");
	}

}
