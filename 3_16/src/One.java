import java.util.Scanner;

public class One{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee=sc.next();
		int num=sc.nextInt();
		

		if (coffee.equals("����������")){
			System.out.println(2000*num+"���Դϴ�.");}
		else if(coffee.equals("�Ƹ޸�ī��")){
			System.out.println(2500*num+"���Դϴ�.");}
		else if (coffee.equals("īǪġ��")){
			System.out.println(3000*num+"���Դϴ�.");}
		else if (coffee.equals("ī���")){
			System.out.println(3500*num+"���Դϴ�.");}

		sc.close();
	}
	
}