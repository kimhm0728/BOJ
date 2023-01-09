package week1_2;

import java.util.*;
import java.io.*;

public class B_21758 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] honey = new int[N];

		int answer = 0;
		int firstR, secondR, firstL, secondL;
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			honey[i] = Integer.parseInt(st.nextToken());
			sum += honey[i];
		}

		firstR = sum - honey[0]; // ���� ���� ���� �� ���� �� (���� �������� ������ ��� ù ��° ���� ���� ������ ����)
		secondR = firstR;
		firstL = sum - honey[N - 1]; // ���� ������ ���� �� ���� �� (���� ������ ������ ��� ù ��° ���� ������ ������ ����)
		secondL = firstL;
		int middle = sum - honey[0] - honey[N - 1]; // �߰��� ������ �����ϴ� ��� -> ��ü �տ��� �糡 ���� �߰��� ���ϱ�

		
		for(int i=0;i<N;i++) {
			if(i != N - 1 && i != 0) { // �߰��� ������ �����ϴ� ��� 
				answer = Math.max(middle + honey[i], answer);
			}
			else if(i != 0) { // ���� �������� ����
				firstR -= honey[i]; // i�� �� ��° ���� ���, �� ����� �� ����
				secondR -= honey[i];
				answer = Math.max(firstR + secondR, answer);
				firstR += honey[i]; // �ٽ� �ǵ����� (�� ��° ���� �������� �� ĭ�� �̵��ϸ鼭 ���� ���� �پ��Ƿ� �ǵ����� ����)
			}			
			else if(i != N -1) { // ���� ������ ����
				firstL -= honey[i]; // i�� �� ��° ���� ���, �� ����� �� ����
				secondL -= honey[i];
				answer = Math.max(firstL + secondL, answer);
				firstL += honey[i]; // �ٽ� �ǵ����� (�� ��° ���� ���������� �� ĭ�� �̵��ϸ鼭 ���� ���� �پ��Ƿ� �ǵ����� ����)
			}
		}

		System.out.println(answer);
	}

}
