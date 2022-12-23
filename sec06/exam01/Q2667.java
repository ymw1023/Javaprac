package sec06.exam01;

import java.util.Scanner;

public class Q2667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  //개행문자 제거
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            String cnt = sc.nextLine();
            for(int j = 0; j < n; j++) {
                arr[i][j] = cnt.charAt(j) - 48;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    if(j > 0) {
                        if(arr[i][j - 1] == 1)
                            continue;
                    }
                    if(i > 0) {
                        if(arr[i - 1][j] == 1)
                            continue;
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
