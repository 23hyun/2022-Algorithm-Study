// package Step7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line = 1;		// ���° ������ Ȯ���� ���� (���⼭ ���� �迭�� ���� ���ϴ� ���� �ƴ϶� ������׷� ǥ���ϴ� ���� ���Ѵ�)
		int numer = 1; 		// ����
		int denomi = 1; 	// �и�
		boolean even = true;
		
		for(line = 1;n>line;line++) {
			n -= line;		// �Է¹��� ���� �ٺ��� ũ�ٸ� 1���� �����鼭 �� ��° ������ �˾Ƴ���
		}
		
		if(line%2 == 0) 	// ¦����° ���̸�
			denomi = line;	
		else {				// Ȧ����° ���̸� 
			numer = line;
			even = false;
		}
		
		for(int i = 1;i<n;i++) {
			if(even) {
				denomi--;
				numer++;
			}
			else {
				denomi++;
				numer--;
			}
		}
		System.out.print(numer + "/" + denomi);
	}
}