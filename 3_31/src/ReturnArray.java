//������ ���� �迭�� �����Ͽ� ��õ�ϴ� makeArray()�� �ۼ��ϰ�, �� �޼ҵ�κ��� �迭�� ���޹޴� ���α׷��� �ۼ�
public class ReturnArray {
	static int[] makeArray() { //makeArray�� �����ص� ������ �迭�� �Ҹ� X
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;//�迭 �ʱ�ȭ 0 1 2 3
		}
		return temp; //�迭 ����
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray=makeArray(); //�޼ҵ尡 ������ �迭 ����
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+ " ");
		}
	}

}
