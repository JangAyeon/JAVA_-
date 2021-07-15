package midterm;
import java.util.Scanner;

public class ca {
	



		public void main(String[] args) {     

			char grade;

			Scanner scanner = new Scanner(System.in); //고침 1



			System.out.print("점수를 입력하세요(0~100):"); //고침 2

			int score = scanner.nextInt(); 



			if(score >= 90)

			grade = 'A';

			else if (score >= 80) //고침 3

			grade = 'B';

			else if(score >= 70)

			grade = 'C';

			else if (score >= 60)

			grade = 'D';

			else

			grade = 'F';



			System.out.println("학점은" + grade + "입니다."); //고침 4

		}	

}
