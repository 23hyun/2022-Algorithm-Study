// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[26];
		for(int i = 0;i<26;i++) 
			list[i] = -1;
		
		String S = bf.readLine();
		
		for(int i = 0;i<S.length();i++) {
			if(list[S.charAt(i) - 'a'] == -1) // ���ڸ� �ϳ��� �о�ͼ� 'a'��ŭ ���� ���ĺ� ������� �ƽ�Ű �ڵ尪�� 0���� ����.
				list[S.charAt(i) - 'a'] = i;
		}
		
		for(int n : list)
			System.out.print(n + " ");
		
		bf.close();
	}
}