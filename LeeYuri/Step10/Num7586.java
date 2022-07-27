// package Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[][] list = new int[N][3];	// 2���� �迭�� �����. list[][0]���� x��, list[][1]���� y��, list[][2]�� ��ġ ����� �����Ѵ�.
		
		// x, y�� ��� �޾� list�� ����
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
			list[i][2] = 1;
		}
		
		// ��� list�� x, y���� ���Ͽ� �� �� �� ���� ����� ��ġ ����� ++ �Ѵ�.
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j == i) continue;	// �ڱ� �ڽŰ��� ������ �ʴ´�.
				if(list[j][0] > list[i][0] && list[j][1] > list[i][1]) list[i][2]++;
			}
		}
		
		for(int k = 0; k < N; k++) {
			sb.append(list[k][2]).append(" ");
		}
		
		System.out.print(sb);
		bf.close();
	}
}