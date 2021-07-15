/*예제 7-1 : 정수만 다루는 Vector <Integer> 컬렉션 활용
 정수만 다루는 Vector<Integer> 제네릭 벡터를 생성하고 활용하는 사례를 보인다. 
 다음 코드에 대한 결과는 무엇인가??*/

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		//정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5); //5 삽입
		v.add(4); //4 삽입
		v.add(-1); //-1 삽입
		
		//벡터 중간에 삽입
		v.add(2,100);//index가 2번인 것에 100 삽입 -> 4와 -1사이에 100 삽입
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		
		//모든 요소 정수 출력하기
		for(int i=0;i<v.size();i++) {
			int n=v.get(i); //벡터의 i번째 정수
			System.out.println(n);
		}
		//벡터 속의 모든 정수 더하기
		int sum=0;
		for(int i=0;i<v.size();i++) {
			int n=v.elementAt(i);//벡터의 i번째 정수
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합: "+sum);
	}
}
