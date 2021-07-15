//배열의 length 필드를 이용하여 배열의 크기만큼 정수를 입력 받고 평균 출력
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오: ");
		int intArray[]=new int[5];
		
		double sum=0.0;
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=scanner.nextInt();//키보드에서 받은 정수 저장
		}
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];//배열에 저장된 정수 값 더하기
		}
		System.out.print("평균은 "+sum/intArray.length);
		scanner.close();
		
	}

}
