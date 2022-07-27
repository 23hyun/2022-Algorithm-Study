// package Step8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = sc.nextInt(), prime = 2;

		if(N == 1) return;			// ���� �Է¹��� ���� 1�̸� ���α׷� ����
		
		while(prime<=N) {			// prime���� N���� �۰ų� ���ٸ� �ݺ�
			if(N%prime == 0) {		// N�� prime���� ���� �������� 0�̸�
				N /= prime;			// N�� prime���� ���� ������ ����
				list.add(prime);	// ArrayList(���� �迭)�� prime�� �߰�
			}
			else prime++;			// �������� 0�� �ƴϸ� prime���� ������Ŵ
		}
		Collections.sort(list);		// ArrayList�� ������������ ����
		
		for(int n : list)
			System.out.println(n);
	}
}