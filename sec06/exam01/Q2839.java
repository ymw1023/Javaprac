package sec06.exam01;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while(n >= 3) {
            if(n % 5 == 0) {
                count = count + n / 5;
                n = 0;
                break;
            }
            n -= 3;
            count++;
        }
        if(n > 0) {
            count = -1;
        }
        System.out.println(count);
    }
}
