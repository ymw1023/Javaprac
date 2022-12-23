package sec06.exam01;

import java.util.Scanner;

public class Q2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] wine = new int[n];
        int[] dp = new int[n + 1];
        for(int i = 0; i < n; i++) {
            wine[i] = sc.nextInt();
        }

        dp[1] = wine[0];
        if(n <= 1) {
            System.out.println(dp[1]);
            return;
        }
        dp[2] = dp[1] + wine[1];
        if(n <= 2) {
            System.out.println(dp[2]);
            return;
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + wine[i - 2] + wine[i - 1];
            dp[i] = Math.max(dp[i], dp[i - 2] + wine[i - 1]);
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        System.out.println(dp[n]);
    }
}

//6
//6
//10
//13
//9
//8
//1