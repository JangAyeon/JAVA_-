import java.util.Scanner;
//���̸� �Է� �޾� 20������ �Ǻ��ϴ� ���α׷�

public class twenties {
	public static void main(String[] arg) {
		
		Scanner scanner=new Scanner(System.in);
		//int x=10;
		System.out.print("���̸� �Է��Ͻÿ�");
		int age=scanner.nextInt();
		
		if((age>=20)&&(age<=30)) {//���̰� 20 ~ 29
			System.out.print("20���Դϴ�.");
			System.out.println("20��� �ູ�մϴ�.");
			
		}
		else {
			System.out.println("20�밡 �ƴմϴ�.");
		}
		scanner.close();
	}

}
