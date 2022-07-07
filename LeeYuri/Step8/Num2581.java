// package Step8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N = sc.nextInt();
		int min = N+1, sum = 0, count = 0;
		boolean check;
		
		for(int i=M;i<=N;i++) {
			check = true;
			if(i > 1) {							// 1�� �Ҽ��� �ƴϱ⿡ 1���� ū ��츸 �Ҽ� �Ǻ�
				for(int j=2;j<i;j++)		
					if(i%j == 0) check = false;	// 2���� i-1������ ���� ����������� check�� false�� ����
				if(check) {						// check�� true�� ��쿡��
					count++;					
					sum += i;					// �Ҽ��� sum�� ����
					if(i<min) min = i;			// min���� ������ min���� ����
				}
			}
		}
		
		if(count == 0) System.out.print("-1");	// ���� count�� 0�̸� �Ҽ��� �ϳ��� ���� ���̹Ƿ� -1���
		else System.out.print(sum + "\n" + min);
	}
}