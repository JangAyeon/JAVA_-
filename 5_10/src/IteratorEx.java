/*예제 7-4 : Iterator<Integer>를 이용하여 정수 벡터 검색
 예제 7-1의 코드 중에 벡터 검색 부분을 Iterator<Integer>를 이용하여 수정하라.*/

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		
		//정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> v=new Vector<Integer>();
		v.add(5); //5 삽입
		v.add(4); //4 삽입
		v.add(-1); //-1 삽입
		v.add(2,100); //인덱스가 2인 곳, 4와 -1 사이에 2 삽입
		
		//Iterator를 이용한 모든 정수 출력
		Iterator<Integer> it=v.iterator(); //Iterator 객체 얻기
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
		}
		
		//Iterator를 이용하여 모든 정수 더하기
		int sum=0;
		it=v.iterator(); //Iterator 객체 얻기
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("백터에 있는 정수 합: "+sum);
	}

}
