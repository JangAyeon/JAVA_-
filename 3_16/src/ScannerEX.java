import java.util.Scanner;

public class ScannerEX {
	
	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 분리하여 입력하세요");
		
		Scanner scanner;
		//Scanner 크기 만큼에 scanner를 선언 (int x;)
		scanner = new Scanner(System.in);
		//미리 만든 scanner에 System.in이라는 값만 집어 넣음(x=10;)
		
		String name;
		name=scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		
		String city=scanner.next();
		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		
		int age=scanner.nextInt();
		System.out.println("당신의 나이는 "+age+"입니다.");
		
		double weight=scanner.nextDouble();
		System.out.println("당신의 체중은 "+weight+"입니다.");
		
		boolean single=scanner.nextBoolean();
		System.out.println("당신의 독신여부는 "+single+"입니다.");
		
		scanner.close();
		//Scanner 다 쓰면 꼭 닫아 줘야함
	}

}
