package final_term;

interface  Num01{

	int add(int x, int y); // x�� y�� ���� �����Ѵ�
	
	int add(int n); //1���� n������ ������ ���� �����Ѵ�.

}
class Ave{

public double average(int[] a) {

double sum = 0;

for(int i = 0; i < a.length; i++)

sum += a[i];

return sum/a.length;

   }

}



public class TestLast01 extends Ave implements Num01{
	public int add(int x, int y) {
		return x+y; 
	}
	public int add(int x) {
		int sum=0;
		for(int i=1;i<=x;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		TestLast01 a=new TestLast01();
		System.out.println("4+6= "+a.add(4,6));
		System.out.println("1���� 5���� ��= "+a.add(5));
		int [] list= {4,9,11};
		System.out.println("4,9,11 ���= "+a.average(list));
		
	}
	
}

