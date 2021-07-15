//2중 중첩된 for문을 이용해 구구단을 출력하는 프로그램을 작성
public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i + "*" + j+ "=" + i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
