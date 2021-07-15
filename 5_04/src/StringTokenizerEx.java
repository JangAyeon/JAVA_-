/*예제 6-7 : StringTokenizer를 이용한 문자열 분리
 * "name=kitae&addr=seoul&age=21"를 문자 &를 기	준으로 분리하는 코드 작성*/

import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args) {
		String query="name=kitae&addr=seoul&age=21";
		StringTokenizer st=new StringTokenizer(query,"&");
		
		int n=st.countTokens(); //분리된 토큰 개수
		System.out.println("토큰 개수 = "+n);
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken(); //토큰 얻기
			System.out.println(token);  //토큰 출력
		}
		
		
	}

}
