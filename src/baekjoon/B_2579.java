package baekjoon;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2579 {
	static int[] score;
	static Integer dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ��� ����
		score = new int[N+1];
		dp = new Integer[N+1];
		for(int i=1;i<=N;i++) 
			score[i] = Integer.parseInt(br.readLine());
		dp[0] = 0;
		dp[1] = score[1];
		if(N>=2) // N�� 2���� ���� ���� �����Ƿ�
			dp[2] = score[1] + score[2];
		System.out.println(DP(N));
	}
	static int DP(int n) {
		if(dp[n] != null) // Integer �迭�� �ʱⰪ�� null
			return dp[n];
		return dp[n] = Math.max(DP(n-2), DP(n-3) + score[n-1]) + score[n];
	}
}
