package sec06.exam01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print(' ');
                }
                for(int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }
            for(int i = 1; i < n; i++) {
                for(int j = 0; j < n - i - 1; j++) {
                    System.out.print(' ');
                }
                for(int j = 0; j < 2 * i + 1; j++) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }
            bf.flush();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
