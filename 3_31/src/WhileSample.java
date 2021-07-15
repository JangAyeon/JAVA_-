//while문을 이용해 정수를 여러개 입력받고 평균 출력. 0 입력시 종료

import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int count =0,n=0;
		double sum=0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하시오");
		while((n=scanner.nextInt())!=0) {//0이 입력되면 while문 벗어남
			sum+=n;
			count++;

		}
		System.out.print("수의 개수는 "+count+"개이며");
		System.out.println("평균은 "+sum/count+"입니다.");
		
		scanner.close();
	}

}
