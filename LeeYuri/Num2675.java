// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());	// ù ��° �ٿ� �ִ� ����(������)�� int������ ����
		
		for(int i=0;i<num;i++) {	
			String S = bf.readLine();
			int n = S.charAt(0) - '0';		// �� �� �ݺ��� ���� 0��°�� �������Ƿ� �о�� int������ ���� (0��ŭ ���ָ� ���ϴ� ���ڰ��� �ƽ�Ű�ڵ带 ���� �� ����)
			
			for(int j=2;j<S.length();j++) {	// �� ���� 2��° �ε������� ���ڰ� ���۵Ǳ� ������ j�� 2���� ����
				for(int l=0;l<n;l++) {		
					System.out.print(S.charAt(j));
				}
			}
			System.out.print("\n");
		}
		bf.close();
	}
}