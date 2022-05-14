// package Step4;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	// �б� ����
		
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);	// ���پ� �о�� ���� �ϳ��� �ɰ��ش�
		
		for(int i = 0;i<n;i++) 
			array[i] = Integer.parseInt(st.nextToken());	// int������ ��ȯ
		
		Arrays.sort(array);		// ������������ ����
		
		System.out.println(array[0]+" "+array[n-1]);
		
		bf.close();	// ���۴� �ݵ�� close����� �Ѵ�
	}
}