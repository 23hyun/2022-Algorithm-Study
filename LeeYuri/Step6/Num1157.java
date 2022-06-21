package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ����
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 */

public class Num1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();					// ���ڿ��� �Է¹���
		s = s.toUpperCase();						// ���ڿ��� ��� �빮�ڷ� ����

		int[] list = new int[26];					// ���ĺ��� �� �� ���Ǿ����� ������ ������ �迭
		
		for(int i=0;i<s.length();i++) 
			list[s.charAt(i) - 'A']++;				// ���ڿ����� �� ���ھ� ������ 'A'��ŭ �� ���� �ε����� ����Ͽ� ++�Ѵ�.

		int max = -1, max2 = -1, result = 0;		// ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��츦 �˱����� max������ 2�� �д�.
		
		for(int i=0;i<list.length;i++) {
			if(list[i]>max) {						// max���� list[i]�� �ִ� ���� ũ�ٸ� 
				max = list[i];						// max�� ����
				result = i;
			}
			else if(list[i] > max2) max2 = list[i];	// list[i]�� �ִ� �� max���� ũ�� ������ max2���� ũ�ٸ� max2�� ����
		}
		
		if(max == max2) System.out.print("?");		// ���� max�� max2���� ���ٸ� ?���
		else System.out.print((char)(result + 'A') + " ");
		
		bf.close();
	}
}