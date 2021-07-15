/*���� 7-4 : Iterator<Integer>�� �̿��Ͽ� ���� ���� �˻�
 ���� 7-1�� �ڵ� �߿� ���� �˻� �κ��� Iterator<Integer>�� �̿��Ͽ� �����϶�.*/

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		
		//�������� �ٷ�� ���׸� ���� ����
		Vector<Integer> v=new Vector<Integer>();
		v.add(5); //5 ����
		v.add(4); //4 ����
		v.add(-1); //-1 ����
		v.add(2,100); //�ε����� 2�� ��, 4�� -1 ���̿� 2 ����
		
		//Iterator�� �̿��� ��� ���� ���
		Iterator<Integer> it=v.iterator(); //Iterator ��ü ���
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
		}
		
		//Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum=0;
		it=v.iterator(); //Iterator ��ü ���
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��: "+sum);
	}

}
