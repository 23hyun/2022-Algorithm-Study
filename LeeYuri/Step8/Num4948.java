// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int count, max;		// count: �Ҽ��� ���� max: 2*n
		boolean[] list;		// �Ҽ����� �Ǻ��ϱ� ���� �迭
		
		while(n != 0) {
			max = 2*n;					// n���� 2*n �����̱� ������ max���� 2*n���� ����
			list = new boolean[max+1];	// �迭�� ũ�⸦ max+1�� �����Ѵ�
			count = 0;
			
			// �����佺�׳׽��� ü�� �̿��Ͽ� �Ҽ��� ���Ѵ�.
			for(int i=2;i<=max;i++) {	// 1�� �Ҽ��� ���Ե��� �ʱ� ������ 2���� ����
				if(list[i]) continue;	// �迭�� �̹� true��� �̹� �ݺ� ������ �ǳʶڴ�
				
				if(i>n) count++;		// �迭�� false�̸鼭 i�� n���� ũ�ٸ� count�� ++�Ѵ�
				
				for(int j=i+i;j<=max;j+=i) {
					list[j] = true;		// �Ҽ��� ����� ��� true�� �����Ѵ�.
				}
			}
			
			System.out.println(count);
			n = Integer.parseInt(bf.readLine());
		}
	}
}