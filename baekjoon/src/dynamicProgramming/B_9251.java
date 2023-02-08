package dynamicProgramming;

import java.io.*;

public class B_9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s1 = br.readLine().toCharArray();
		char[] s2 = br.readLine().toCharArray();

		int N = s1.length;
		int M = s2.length;
		int[][] dp = new int[N + 1][M + 1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(s1[i - 1] == s2[j - 1])
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		
		System.out.println(dp[N][M]);
	}

}
