// package Step9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		if(n < 2) return n;	// 0 �Ǵ� 1�̸� �״�� ��ȯ
		return Fibonacci(n-1) + Fibonacci(n-2);	// 2 �̻��̸� �Ǻ���ġ ���� ���Ŀ� ���� �ڱ� �ڽ��� ȣ���Ѵ�.
	}
}