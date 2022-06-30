import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	int platNum;
	int gettingOn, gettingOff; // ����, ���� �ο�
	static int capacity = 0; // ���� Ÿ�� �ִ� ��� �� (����� ���������� �̷����Ƿ� ���� ������ ����
		
	public Main(int off, int on) {
		gettingOn = on;
		gettingOff = off;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Main> platforms = new ArrayList<>();
		ArrayList<Integer> platformCapa = new ArrayList<>();
		
		for(int i=1; i<11; i++) {
			Main platform = new Main(sc.nextInt(), sc.nextInt()); // �� �� �ν��Ͻ�
			capacity = capacity - platform.gettingOff + platform.gettingOn; // �������� Ÿ�� �ִ� ��� ��
			platformCapa.add(capacity); // �񱳸� ���� �迭�� ����
		}
		
		int max = platformCapa.get(0);
		for(int j=1; j<platformCapa.size(); j++) {
			if(platformCapa.get(j)>max) {
				max = platformCapa.get(j);
			}
		}
		
		System.out.println(max);
	}

}
