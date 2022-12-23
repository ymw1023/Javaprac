package sec06.exam01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2448 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        boolean[][] arr = new boolean[n][2 * n];

        star(0, 0, n, arr);

        try {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < 2 * n; j++) {
                    if(arr[i][j])
                        bf.write('*');
                    else
                        bf.write(' ');
                }
                bf.write('\n');
            }
            bf.flush();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void star(int y, int x, int size, boolean[][] arr) {
        if(size == 3) {
            arr[y][x + 2] = true;
            arr[y + 1][x + 1] = true;
            arr[y + 1][x + 3] = true;
            arr[y + 2][x] = true;
            arr[y + 2][x + 1] = true;
            arr[y + 2][x + 2] = true;
            arr[y + 2][x + 3] = true;
            arr[y + 2][x + 4] = true;
        }
        else {
            star(y, x + size / 2, size / 2, arr);
            star(y + size / 2, x, size / 2, arr);
            star(y + size / 2, x + size, size / 2, arr);
        }
    }
}
