// package Step7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		
		if(B>=C) {						// ���� ��������� �Ǹź�뺸�� ũ�ų� ���ٸ�
			System.out.println("-1");	// ���ͺб����� ���� ������ -1 ���
			return;						// ���α׷� ����
		}
		System.out.println(A/(C-B)+1);	// ���ͺб����� ���ϴ� ���� ����Ͽ� ���
	}
}