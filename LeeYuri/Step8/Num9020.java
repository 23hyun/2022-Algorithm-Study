// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T, N, A, B;		// T: �ݺ�Ƚ��, N: ¦��, A: ù ��° �Ҽ�, B: �� ��° �Ҽ�
		boolean list[];		// �Ҽ��� �Ǻ��� �迭 
		
		T = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<T;i++) {	
			N = Integer.parseInt(bf.readLine());
			list = new boolean[N+1];
			
			// 2���� N���� �Ҽ��� �Ǻ��Ͽ� �迭�� ǥ���Ѵ�.
			for(int j=2;j<=N;j++) {
				if(list[j]) continue;
				
				for(int l=j+j;l<=N;l+=j) list[l] = true;
			}
			
			A = B = N/2;	// N�� 2�� ���� ���� A�� B�� �ִ´�
			
			while(true) {	
				if(list[A]) { // ���� A�� �Ҽ����
					A--; B++; // A�� -- B�� ++
				}
				else if(list[B]) { // A�� �Ҽ��ε� B�� �Ҽ��� �ƴ� ���
					A--; B++; // A�� -- B�� ++ 
				}
				else break;	  // A�� B�� ��� �Ҽ���� while�� ����
			}
			System.out.println(A + " " + B);
		}
		bf.close();
	}
}