import java.util.Scanner;
//나이를 입력 받아 20대인지 판별하는 프로그램

public class twenties {
	public static void main(String[] arg) {
		
		Scanner scanner=new Scanner(System.in);
		//int x=10;
		System.out.print("나이를 입력하시오");
		int age=scanner.nextInt();
		
		if((age>=20)&&(age<=30)) {//나이가 20 ~ 29
			System.out.print("20대입니다.");
			System.out.println("20대라서 행복합니다.");
			
		}
		else {
			System.out.println("20대가 아닙니다.");
		}
		scanner.close();
	}

}
