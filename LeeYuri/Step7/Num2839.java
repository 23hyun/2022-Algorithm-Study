// package Step7;

/*
 * ���� ���
 * 5kg, 3kg �� ���� ������ ������ ��Ȯ�� Nkg�� ������ ����ؾ��Ѵ�.
 * �ִ��� ���� ���� ������ ������ ����ϵ��� �ϸ� ���� �� ���� �������� �Ǵ��� ���Ͽ� ����غ���.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int tmp = N/5;tmp>=0;tmp--) {	// tmp �� 5kg ������ �������� ���� ���� N�� �� �°� ����������� �ʴ´ٸ� tmp�� 1�� ���δ�.
			if((N-tmp*5)%3 == 0) {			// 5kg, 3kg������ Nkg�� ����������ٸ�
				int tmp2 = (N-tmp*5)/3;		// 3kg ���� ������ ���Ͽ� �ӽ� ������ ����
				System.out.println(tmp + tmp2);	// ���� ���� ������ ���
				return;						// ���α׷� ����
			}	
		}
		System.out.println("-1");			// ���� ���� ���� ������ ������ ���ߴٸ� -1 ���
	}
}