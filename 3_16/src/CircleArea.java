
public class CircleArea {
	public static void main(String[] args) {
		
		final double PI = 3.14;
		//final : 상수, PI : 원주율
		double radius = 10.2;
		//radius : 원의 반지름
		double circleArea=radius*radius*PI;
		//원의 면적 계산식
		
		//원의 면적을 화면에 출력
		System.out.print("반지름"+radius+",");
		//~print : 줄바꿈 없는 출력, + : 문자열 연산
		System.out.println("원의 면적= "+circleArea);
		
		//출력 예상 : 반지름10.2,원의 면적= 326.어쩌구 
	}

}
