//�迭�� length �ʵ带 �̿��Ͽ� �迭�� ũ�⸸ŭ ������ �Է� �ް� ��� ���
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("5���� ������ �Է��Ͻÿ�: ");
		int intArray[]=new int[5];
		
		double sum=0.0;
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=scanner.nextInt();//Ű���忡�� ���� ���� ����
		}
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];//�迭�� ����� ���� �� ���ϱ�
		}
		System.out.print("����� "+sum/intArray.length);
		scanner.close();
		
	}

}
