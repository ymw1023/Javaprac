package sec06.exam01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q11729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
//            bf.write((int)Math.pow(2, n) - 1);    //int가 이상하게 출력 되서 일단 주석처리
            System.out.println((int)Math.pow(2, n) - 1);
//            bf.write('\n');   //int 를 버퍼로 출력시 줄바꿈 필요
            bf.flush();
            hanoi(1, 3, n, bf);     //목표 - 처음위치 1에서 끝위치 3으로 n크기의 탑을 옮김
            bf.flush();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void hanoi(int start, int end, int num, BufferedWriter bf) {
        //시작과 끝 값이 호출마다 바뀜, 따라서 middle 값도 바뀌게
        int middle = 6 - start - end;
        try {
            if(num == 1) {  //재귀의 끝나는 지점
                bf.write(start + " " + end + "\n");
                return;
            }   //1 -> 3을 갈려면 맨밑블록만 냅두고 다른거는 중간(2)으로 옮겨야됨
            hanoi(start, middle, num - 1, bf);

            //여기까지 했다면 대충 첫번째 칸에는 아무것도 없고 2번째칸에 제일 큰블럭이 빠진 칸이 있으며
            //3번째 칸에 제일 큰 블럭이 있음 - 재귀라 조금 다르긴 한데 이미지로 생각하면

            bf.write(start + " " + end + "\n");

            hanoi(middle, end, num - 1, bf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }   //큰 흐름이 맨 밑에 것 빼고 중간으로 옮기고, 맨 밑에 것을 끝으로 옮기고 중간 것을 끝으로옮김
}       //n-1이 될때마다 시작 지점 끝 지점이 바뀜
