// package Step9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int count = hanoi_count(N);	// �ű� Ƚ���� ������� ����ϴ� �Լ��� ȣ���Ͽ� ������ �޴´�.
		
		bfw.append(count + "\n");
		hanoi(N, 1, 2, 3);
		
		bfw.close();
	}

	public static int hanoi_count(int N) {	// �ű� Ƚ���� ������� ����ϴ� ����Լ�
		if(N == 1) return 1;
		return 2 * hanoi_count(N-1) + 1;
	}
	
	public static void hanoi(int N, int A, int B, int C) throws IOException {	// A, B, C�� 3���� ��븦 �ǹ��ϸ� ó�� ���� 1, 2, 3
		if(N == 1) bfw.append(A + " " + C + "\n");	// ���� ����(N)�� 1����� A���� C�� �ű��.
		else { // ������ �� ���� �ƴ϶��
			hanoi(N-1, A, C, B);			/* ��� ȣ�������μ� ������ ¦������ if(N == 1) �������� 1->2�� ���� �Ű�����, 
												Ȧ������ 1->3�� ���� �Ű�����.
												1������ �ٸ� ���� ������ �̵��ϴ� ��츦 �� ȣ���� ���� �˾Ƴ� �� �ִ�. */
			bfw.append(A + " " + C + "\n");	
			hanoi(N-1, B, A, C);			// 2�� �Ǵ� 3������ �ٸ� ���� �̵��ϴ� ��츦 �� ȣ���� ���� �˾Ƴ� �� �ִ�.
		}
	}
}