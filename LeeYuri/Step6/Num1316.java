package Step6;

/*
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
 * kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. 
 * �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt(), count = 0;
		boolean check;							// ���ڰ� �������� ��Ÿ�� ������� �ƴ��� Ȯ��
		
		for(int i=0;i<n;i++) {
			String s = sc.next();			
			int[] alphabet = new int[26];		// � ���ڰ� ���Ǿ������� ������ �迭
			check = true;						// check = true�̸� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� �ǹ�
			
			for(int j=0;j<s.length();j++) {
				char a = s.charAt(j); 		
				if(alphabet[a - 'a'] > 0) {		// ���� �迭�� �̹� 1 �̻��� ���� �ִٸ�
					if(a != s.charAt(j-1)) {	// ������ ���ĺ��� ���ؼ� �ٸ��ٸ�
						check = false;			// �����ؼ� ���� ���� �ƴϹǷ� check�� false�� ����
						break;					// ���� for���� �ߴܽ�Ŵ
					}
				} else alphabet[a - 'a']++;
			}
			if(check) count++;					// check�� true�϶��� count++
		}
		System.out.print(count);
	}
}