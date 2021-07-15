//for-each문을 활용해 int [] 배열의 합을 구하고, String [] 배열의 문자열을 출력하는 사례
public class foreachEx {
	public static void main(String[] args) {
		int [] n= {1,2,3,4,5};
		int sum=0;
		for(int k:n) { //k는 n[0], n[1], n[2]...n[4]로 반복
			System.out.print(k+" "); //반복되는 k값 출력
			sum+=k;
		}
		System.out.println("합은 "+sum);
		String f[]= {"사과","배","바나나","체리","딸기","포도"};
		for (String s: f) { //s는 f[0], f[1], f[2]..f[5]로 반복
			System.out.print(s+" ");
		}
	}

}
