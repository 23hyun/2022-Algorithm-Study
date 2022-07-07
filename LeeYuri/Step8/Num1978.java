// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());	// �׽�Ʈ ������ ����
		int tmp, count = 0;							// tmp: �Ҽ����� �Ǻ��� ���� ��� ������ ���� | count: �Ҽ��� ����
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<T;i++) {
			tmp = Integer.parseInt(st.nextToken());	// ���ڸ� �ϳ� ������ tmp�� ����
			
			if(tmp > 1) {							// 1�� �Ҽ��� �ƴϱ⿡ 1���� ū ��츸 �Ҽ� �Ǻ�
				for(int j=2;j<tmp;j++) {			
					if(tmp%j == 0) {				// 2���� tmp���� ���� ������ tmp�� ������ �� �������� 0�̶�� �Ҽ��� �ƴϴ�.
						count--;					// count���� ��ȭ�� ���� �ʱ� ���� --
						break;						// ���� for���� ������Ŵ
					}
				}
				count++;
			}
		}
		System.out.println(count);
		
		bf.close();
	}
}