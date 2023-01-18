package backTracking;

import java.io.*;

public class B_9663 {
	static int answer = 0;
	static int N;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N]; // �ε���: ��, ��: ��
		
		DFS(0);
		System.out.println(answer);
	}

	static void DFS(int depth) {
		if(depth == N) {
			answer++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			arr[depth] = i;
			
			if(check(depth))
				DFS(depth + 1);
		}
	}
	
	// ���� ������ �� �ִ� ���� �����ϴ��� üũ
	static boolean check(int col) {
		for(int i=0;i<col;i++) {
			if(arr[col] == arr[i]) // �� ���� ���� �࿡ �����ϴ� ���
				return false;
			
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) // �밢���� �����ϴ� ���
				return false;
		}
		
		return true;
	}
}
