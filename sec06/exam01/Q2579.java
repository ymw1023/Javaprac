package sec06.exam01;

import java.util.Scanner;

public class Q2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stairs = new int[n];
        int[] dp = new int[n + 1];

        for(int i = 0; i < n; i++) {
            stairs[i] = sc.nextInt();
        }

        dp[1] = stairs[0];  //1까지의 최대값
        if(n <= 1) {
            System.out.println(dp[1]);
            return;
        }
        dp[2] = dp[1] + stairs[1];  //2까지의 최대값
        if(n <= 2) {
            System.out.println(dp[2]);
            return;
        }
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + stairs[i - 2] + stairs[i - 1];
            dp[i] = Math.max(dp[i],dp[i - 2] + stairs[i - 1]);
        }


        System.out.println(dp[n]);
    }
}


//6
//10
//20
//15
//25
//10
//20