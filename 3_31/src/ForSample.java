//for문을 이용하여 1부터 10까지 덧셈으로 표시하고 합을 출력하라
public class ForSample {
	public static void main(String[] args) {
		int i,sum=0;
		
		for(i=1;i<=10;i++) { //1부터 10까지 반복
			sum+=i;//i가 증가하면서 sum에 추가
			System.out.print(i);//더하는 수 출력
			
			if (i<=9) {//1~9까지는 '+' 출력
				System.out.print("+");
				
			}
			else {//i가 10인 경우
				System.out.print("=");//'='출력하고
				System.out.print(sum);//덧셈 결과 출력
			}
			
		}
		
	}

}
