//��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int intArray[];
		intArray=new int[5];
		int max=0;
		System.out.println("��� 5���� �Է��Ͻÿ�: ");
		
		for(int i=0;i<5;i++) {
			intArray[i]=scanner.nextInt(); //�Է¹��� ������ �迭�� ����
			if(intArray[i]>max) {
				max=intArray[i]; //max����
			}
		}
		System.out.print("���� ū ���� "+max+"�Դϴ�.");
		scanner.close();
		
	}

}
