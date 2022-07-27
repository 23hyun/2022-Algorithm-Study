// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// ī���� ����
		int M = sc.nextInt();		// ī���� ���� ���� ������� �ϴ� ��
		int card[] = new int[N];	// ī���� ���� ������ �迭
		int sum = 0, max = 0;		// sum: ī�� 3���� ���Ͽ� ������ ����, max: ī�� 3���� �� �� ���� ū ���� ������ ����
		
		for(int i = 0; i < N; i++) 
			card[i] = sc.nextInt();
		
		// ��ġ�� �ʵ��� 3���� ���� ���Ѵ�.
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					sum = card[i] + card[j] + card[k];	// 3���� ī�带 ���Ѵ�.
					if(sum <= M && sum > max) max = sum;// ���� ���� ���� max���� ũ�ٸ� max�� ����
				}
			}
		}
		System.out.println(max);
	}
}