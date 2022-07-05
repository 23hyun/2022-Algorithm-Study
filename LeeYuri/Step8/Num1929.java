// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
	
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();	// ���ڿ��� �߰��� �� ����
		
		boolean[] list = new boolean[N+1];		// �Ҽ��� ǥ���� �迭. N+1�� ũ��� ������ �Ѵ�.
		list[1] = true;							// list[1]�� true�� �����Ͽ� �Ҽ��� �ƴ��� ǥ���Ѵ�.
		
		for(int p=2;p<=N;p++) {					// 2���� N���� �۰ų� ���� ������ ��� ���� �Ҽ����� �ƴ��� �˻��Ѵ�.
			if(list[p]) continue;				// �̹� �Ҽ��� �ƴ� ������ �迭�� ǥ���صξ��ٸ� �ش� �ݺ� ������ �ǳʶڴ�.
			
			if(p>=M) sb.append(p).append("\n");	// �迭���� false�̸鼭 M���� ũ�ٸ� StringBuilder�� �ٹٲ� ���ڿ� �Բ� �߰��Ѵ�.
			
			for(int i=p+p;i<=N;i+=p) {			// ex) p = 2 ��� 4���� 2�� ����� ��� true�� �����Ѵ�.
				list[i] = true;
			}
		}
		
		System.out.println(sb);
		
		bf.close();
	}
}