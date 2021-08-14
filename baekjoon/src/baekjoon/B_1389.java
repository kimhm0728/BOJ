package baekjoon;
import java.util.*;
import java.io.*;

public class B_1389 {
	static int[] user; // ���� �� �ɺ� ������ ���� ����
	static int[][] rel; // ģ�� ���踦 ����
	static int[][] visited; // ��� �ɺ� ������ �� ����
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		user = new int[N];
		rel = new int[N][N];
		visited = new int[N][N];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			rel[a-1][b-1] = 1; // ���� ��ȣ�� 1~N�̰� �迭�� �ε����� 0~N-1�̹Ƿ�
			rel[b-1][a-1] = 1;
		}
		for(int i=0;i<N;i++)
			for(int j=0;j<N;i++) {
				if(i != j)
					visited[i][j] = kebinBacon(i, j);
			}
		int min = 0;
		for(int i=1;i<N;i++) // �ɺ� �������� ���� ���� ������ ã��
			if(user[min] > user[i])
				min = i;
		for(int i=0;i<N;i++) // �ɺ� ������ ���� ������ ���� ��ȣ�� ���� ������ ���
			if(min != i && visited[min] == visited[i] && min > i)
				min = i;
		System.out.println(min);
	}
	static int kebinBacon(int n, int m) {
		int tmp = n;
		for(int i=0;i<N;i++) {
			if(rel[n][i] == 1)
				tmp = i;
		}
		if(rel[n][m] == 1)
			return rel[n][m] = 1;
		else 
			return rel[n][m] = 1 + kebinBacon(tmp, n); //

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visited[]
		
		if(visited[n][m] != 0)
			return visited[n][m];
		int temp = n;
		while(rel[temp][m] != 1) {
			temp = 
			if(rel[n][m] == 1) {
				visited[n][m] 
				return;
			}
			if(visited[temp, m] == 0)
				visited[temp] = visited[]
		}
	} 
}
