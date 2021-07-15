//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램 작성

import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int intArray[];
		intArray=new int[5];
		int max=0;
		System.out.println("양수 5개를 입력하시오: ");
		
		for(int i=0;i<5;i++) {
			intArray[i]=scanner.nextInt(); //입력받은 정수를 배열에 저장
			if(intArray[i]>max) {
				max=intArray[i]; //max변경
			}
		}
		System.out.print("가장 큰 수는 "+max+"입니다.");
		scanner.close();
		
	}

}
