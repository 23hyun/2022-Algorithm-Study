// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*����
 * ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 * ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 
 * �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
 */

public class Main {
    public static void main(String[] args)throws IOException {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
            StringTokenizer st = new StringTokenizer(rd.readLine(), " ");	// " "���� ���ڿ��� " "�� �����Ͽ� st�� ����
            System.out.println(st.countTokens());	// ��ū�� �� ������ ���� ���
        }
        catch(IOException e) {
            System.out.println("error");
        }
    }
}