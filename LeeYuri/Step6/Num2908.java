// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// ���ڿ��� �о�� ��ü�� ������ s�� ����
		String s = new StringBuffer(bf.readLine()).reverse().toString();
		String[] Num = s.split(" ");	// �������� �����Ͽ� ���ڿ� �迭�� ����
		
		// ���ڿ� �迭�� �ִ� ���� ���� ������ ��ȯ�Ͽ� ������ ����
		int A = Integer.parseInt(Num[0]);
		int B = Integer.parseInt(Num[1]);
		
		// ���� ũ�⸦ ���Ͽ� ū ���� ���
		if(A>B) System.out.print(A);	
		else System.out.print(B);
		bf.close();
	}
}