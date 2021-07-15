/*12-5 : �� �����尡 ���� ������ ��ü�� ���� ���ÿ� ����ϴ� ��� 
 * - synchronized ��� ����*/
public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p=new SharedPrinter();
		String [] engText= {"Wise men say","only fools rush in",
				"Wise men say","only fools rush in",
				"Wise men say","only fools rush in",
				"Wise men say","only fools rush in"};
		String [] korText= {"���ع��� ��λ��� ������ �൵��","�ϴ����� �����ϻ� �츮���� ����",
				"���ع��� ��λ��� ������ �൵��","�ϴ����� �����ϻ� �츮���� ����",
				"���ع��� ��λ��� ������ �൵��","�ϴ����� �����ϻ� �츮���� ����",
				"���ع��� ��λ��� ������ �൵��","�ϴ����� �����ϻ� �츮���� ����"};
		Thread th1=new WorkThread(p,engText);
		Thread th2=new WorkThread(p, korText);
		
		th1.start();
		th2.start();
	}
}

class SharedPrinter{ 
	//���ÿ� ���ٵǴ� ���� ������ : ������ 2���� �� �뿡 ����..!! �� ����
	synchronized void print(String text) { 
		//void print(String text) : ���� ���ٵǾ� ���� ����
		for(int i=0;i<text.length();i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
}

class WorkThread extends Thread{
	SharedPrinter p;
	String [] text;
	public WorkThread(SharedPrinter p, String[] text) {
		//������ ��, ����� �ؽ�Ʈ ����
		//������ �����ֱ�!!
		this.p=p;
		this.text=text;
	}
	public void run() {
		//runnable�� run�� �ڵ����� ������
		//Thread�� �������� ���� ����� �� 
		
		for(int i=0;i<text.length;i++) {
			p.print(text[i]);
		}
		
	}
}
