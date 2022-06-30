// package Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); // BufferedReader�� �� ���� �о�� ���ڿ��� �и��ϱ� ���� ���
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long V = Integer.parseInt(st.nextToken());
		
		if(V == A) {	// ���� V�� A�� ���ٸ� �����̴� ù�� ������ �ö� �� ����
			System.out.println("1");
			return;
		}
		
		/*
		 *  ù�� ���� �ö� �� ���ٸ�?
		 *  A-B�� �Ϸ絿�� �ö� �� �ִ� �����̴�
		 *  ������ �ö󰡱⸸ �ϹǷ� ��ĥ�� �ɸ��� ���� �� �ö� �� �ֱ� ������ 
		 *  V�� -A�� ���� �� �̸� A-B�� ������
		 */
		
		
		long day = (V-A)/(A-B);		
		
		// ���� day�� ��Ȯ�� ������ �������� +1, �������� 1 �̻� ������ +2�Ѵ�
		if((V-A)%(A-B) >= 1) System.out.print(day+2);
		else System.out.print(day+1);
		
		bf.close();
	}
}