//scanner class를 이용해 3개의 정수를 입력받아 합을 구하는 프로그램. 
//사용자가 정수가 아닌 문자를 입력했을 때 발생하는 InputMismatchException 예외처리해 다시 입력받도록 해라

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오: ");
		int sum=0,n=0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=scanner.nextInt(); //정수 입력
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력사에요!");
				scanner.next();
				i--;
				continue;
			}
			sum+=n;//합치기

		}
		System.out.println("합은 "+sum);
		scanner.close();
		
	}

}
