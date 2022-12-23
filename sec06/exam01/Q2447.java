package sec06.exam01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            for(int i = 0; i < n; i++) {
                outer: for(int j = 0; j < n; j++) {
                    int cnt = 1;
                    while(cnt < n) {
                        if(i / cnt % 3 == 1 && j / cnt % 3 == 1) {
                            bf.write(' ');
                            continue outer;
                        }
                        cnt *= 3;
                    }
                    bf.write('*');
                }
                bf.write('\n');
            }
            bf.flush();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
