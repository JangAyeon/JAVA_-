package midterm;

public class dfg {
	public static void main(String[] args) {
		int test= {{1,2,3,4,5},{6,7,8,9,10}};

		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[i].length;j++) {
				System.out.println(test[i][j]);
			}
		}
	}

}
