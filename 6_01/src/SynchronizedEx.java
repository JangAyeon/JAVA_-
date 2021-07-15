/*12-5 : 두 스레드가 공유 프린터 객체를 통해 동시에 출력하는 경우 
 * - synchronized 블록 지정*/
public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p=new SharedPrinter();
		String [] engText= {"Wise men say","only fools rush in",
				"Wise men say","only fools rush in",
				"Wise men say","only fools rush in",
				"Wise men say","only fools rush in"};
		String [] korText= {"동해물과 백두산이 마르고 닮도록","하느님이 보우하사 우리나라 만세",
				"동해물과 백두산이 마르고 닮도록","하느님이 보우하사 우리나라 만세",
				"동해물과 백두산이 마르고 닮도록","하느님이 보우하사 우리나라 만세",
				"동해물과 백두산이 마르고 닮도록","하느님이 보우하사 우리나라 만세"};
		Thread th1=new WorkThread(p,engText);
		Thread th2=new WorkThread(p, korText);
		
		th1.start();
		th2.start();
	}
}

class SharedPrinter{ 
	//동시에 접근되는 공유 스레드 : 스레드 2개가 한 통에 담기는..!! 통 생성
	synchronized void print(String text) { 
		//void print(String text) : 동시 접근되어 문장 깨짐
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
		//스레드 통, 출력할 텍스트 받음
		//받으면 돌려주깅!!
		this.p=p;
		this.text=text;
	}
	public void run() {
		//runnable은 run이 자동으로 생성됨
		//Thread는 수동으로 생성 해줘야 함 
		
		for(int i=0;i<text.length;i++) {
			p.print(text[i]);
		}
		
	}
}
