package sec06.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Q2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //나무의 수     max = 1,000,000
        int num = sc.nextInt();     //필요한 길이    max = 2,000,000,000
                                    //나무길이      max = 1,000,000,000
        int[] arr = new int[n + 1];     //나무의 길이를 담을 배열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  //나무의 길이를 배열에 담음
        }

        Arrays.sort(arr);       //오름차순 정렬
        int i = 1;      //잘리는 나무의 갯수 - 톱이 위에서 내려오는 느낌
        int sum = 0;    //현재 자른 나무 길이
        while(true) {
            long cnt = (long)(arr[arr.length - i] - arr[arr.length - i - 1]) * i;  //(현재 나무길이 - 다음 나무길이) * 현재 나무 수
            if(sum + cnt >= num) {  //넘치면 break;
                break;
            } else {        //안 넘치면 더해줌
                sum += cnt;
            }
            i++;        //나무 한개 추가
        }
                //현재 나무 길이      -    남은 필요 나무 길이 / 현재 나무 수
        int answer = arr[arr.length - i] - (int)Math.ceil((double)(num - sum) / i);

        System.out.println(answer);
    }
}
//        4 7
//
//        20 15 10 17

//형변환 (double)안해서 오~래 걸림

//3 1
//1 1 1


//3 1
//10 10 10