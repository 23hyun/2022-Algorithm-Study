// package Step9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static String underbar = "";
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		bw.flush();
		bw.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");	// �ݺ��Ǵ� �κ��� �ƴϱ� ������ ���� ���
		
		answer(N);	// ����Լ� ȣ��
		
		bw.close();
	}
	
	public static void answer(int N) throws IOException {
		String line = underbar;	// ���������� ����ٸ� ���� ��������� ȣ�� �������� ����� ������ �״�� �����(�������� ����ٰ� �پ�� �� �ֵ��� ��)
		if(N == 0) {			// �ݺ��� �� ������ ������ ���� ����ϰ� return (�� �̻� �ڱ� �ڽ� ȣ�� x)
			bw.append(line + "\"����Լ��� ������?\"\n");
			bw.append(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			bw.append(line + "��� �亯�Ͽ���.\n");
			return;
		}
		
		// answer1�� answer2�� line���� ���� �ٸ���. 
		
		bw.append(line + "\"����Լ��� ������?\"\n");
		bw.append(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		bw.append(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		bw.append(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		
		underbar += "____"; 
		
		answer(N-1);			// N-1�Ͽ� �ڱ� �ڽ��� ȣ��
		
		bw.append(line + "��� �亯�Ͽ���.\n");
	}
}