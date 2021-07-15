//초 단위의 정수를 입력받고 몇시간, 몇분, 몇 초인지를 구하여 출력하는 프로그램


import java.util.Scanner;


public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner; //스캐너 선언 int x
		scanner=new Scanner(System.in); //스캐너 입력 받음
		System.out.print("정수를 입력하세요:");
		int time= scanner.nextInt();//정수 입력 받기
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"초는");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.println(second+"초입니다.");
		scanner.close();
	}
}
