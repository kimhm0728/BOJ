package backTracking;

import java.io.*;

public class B_9663 {
	static int[][] dir = {{-1, -1}, {1, -1}, {-1, 1}, {1, 1},
			{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
	static int answer = 0;
	static int N;
	static boolean [][] visit; // 0: �ƹ��͵� x 1: �� �� ����
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		visit = new boolean[N][N];
		
		DFS(0);
		System.out.println(answer);
		br.close();
	}

	static void DFS(int depth) {
		if(depth == N) {
			answer++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visit[i][j])
					continue;
				
				attackCheck(i, j, true);
				DFS(depth + 1);
				attackCheck(i, j, false);
			}
		}
	}
	
	// ���� ������ �� �ִ� ���� �����ϸ� true, �������� ������ false
	static void attackCheck(int r, int c, boolean b) {
		visit[r][c] = b;
		
		for(int i=0;i<dir.length;i++) {
			int nextR = r;
			int nextC = c;
			
			while(true) {
				nextR += dir[i][0];
				nextC += dir[i][1];
				
				if(nextR < 0 || nextR >= N || nextC < 0 || nextC >= N)
					break;
				
				visit[nextR][nextC] = b;
			}
		}
	}
}
