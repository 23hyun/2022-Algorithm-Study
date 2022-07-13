// package Step9;

import java.util.Scanner;

public class Main {
	int N, factorial;
	
	public Main() {		// ������
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	// �־��� N�� �޴´�.
		factorial = 1;		// ���丮�� ���� ������ ���������� 1�� �ʱ�ȭ�Ѵ�.
		
		rotation(N);		// ����Լ� ȣ�� (N�� �μ��� �־�����)
		
		System.out.println(factorial);
	}
	
	public static void main(String[] args) {
		Main start = new Main();	// ��ü ����
	}
	
	public void rotation(int n) {	// N�� �μ��� �޴� ����Լ�
		if(n > 1) {			// N�� 1���� ū ��쿡��
			factorial *= n;	// ���丮�� ������ n�� ���Ѵ�.
			n--;			// n�� --���ش�.
			rotation(n);	// �ڱ� �ڽ��� ȣ���Ѵ�.
		}
	}
}