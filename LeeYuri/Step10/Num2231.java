// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;			// �������� ������ ����
		
		for(int i = 1; i < N; i++) {
			sum = 0;				// �������� �ݺ� �� �׻� 0���� �ʱ�ȭ�Ѵ�
			int tmp = i;			// i �� ������ �������� ����� N�� ���� ���̱� ������ �ӽ÷� ���� ���� tmp�� i�� ����
			while(tmp / 10 != 0) {	// ���� tmp�� �� �ڸ� ���� �ƴ϶��
				sum += tmp % 10;	// 10���� ���� ������ ���� sum�� ���Ѵ�
				tmp /= 10;			// 10���� ���� ���� tmp�� �����Ѵ�
			}
			sum += tmp;				// ���� �� �ڸ����� sum�� ���Ѵ�
			sum += i;
			if(sum == N) {			// ���� ���� sum���� N�� ���ٸ�
				System.out.println(i);	// i�� ���� ���� ������ �̹Ƿ� i�� ����Ѵ�
				return;					// ���α׷��� �����Ѵ�
			}
		}
		System.out.println("0");	// �����ڰ� ���ٸ� for���� ���������Ƿ� ���⼭ 0�� ����Ѵ�
	}
}