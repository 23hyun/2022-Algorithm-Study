// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
	public static void main(String[] args) throws IOException{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			// ����� ũ�ξ�Ƽ�� ���ĺ��߿��� �α��� �̻��� �͵��� �迭�� ����
			String[] sd = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=", };
			
			// �Է¹��� ���ڿ����� sd�� ������ ���ڿ��� ���ԵǾ����� ��� "."���� ����
			for(String n : sd)
				s = s.replace(n, ".");
			
			// ���ڿ��� ���� ���
			System.out.println(s.length());
			
			bf.close();
	}
}