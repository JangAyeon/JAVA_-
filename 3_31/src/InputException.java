//scanner class�� �̿��� 3���� ������ �Է¹޾� ���� ���ϴ� ���α׷�. 
//����ڰ� ������ �ƴ� ���ڸ� �Է����� �� �߻��ϴ� InputMismatchException ����ó���� �ٽ� �Է¹޵��� �ض�

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�: ");
		int sum=0,n=0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=scanner.nextInt(); //���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է»翡��!");
				scanner.next();
				i--;
				continue;
			}
			sum+=n;//��ġ��

		}
		System.out.println("���� "+sum);
		scanner.close();
		
	}

}
