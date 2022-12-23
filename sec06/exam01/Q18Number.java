package sec06.exam01;

import java.util.Arrays;

public class Q18Number {    //모의고사
    public int[] solution(int[] answers) {
        int[] arr = new int[3]; //각 사람의 정답 갯수
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int c1 = 0, c2 = 0, c3 = 0;
        //이 변수들은 for문 안에서 i와 별개로 a1, a2, a3의 인덱스가 될 변수임

        for(int i = 0; i < answers.length; i++) {
            if(a1[c1] == answers[i]) {
                arr[0]++;
            }
            if(a2[c2] == answers[i]) {
                arr[1]++;
            }
            if(a3[c3] == answers[i]) {
                arr[2]++;
            }
            c1++;   //다음 반복으로 가면(i가 커지면) c1, c2, c3도 같이 커지므로
            c2++;   //각 문제의 번호에 맞게 답을 비교 할 수 있음
            c3++;
            if(c1 == a1.length) {   //배열의 끝에 도달하면 다시 처음부터 찍어야 하므로
                c1 = 0;             //인덱스를 0으로 만들어줌
            }
            if(c2 == a2.length) {
                c2 = 0;
            }
            if(c3 == a3.length) {
                c3 = 0;
            }
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {      //1번, 2번, 3번 수포자 점수 중에
                max = arr[i];       //최고점을 max 변수에 담음
            }   //Math.max
        }
        int cnt = 0;        //최고점이 여러명 일 수도 있으니 변수선언 - 후에 배열을 선언할 때 크기지정에 사용
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) { //점수가 최고점인 사람의 명수를 셈
                cnt++;
            }
        }
        int answer[] = new int[cnt];    //답을 return할 배열 선언 - 크기 지정에 cnt 변수 사용
        cnt = 0;                        //위의 명령문에서 cnt를 썻으니 다른 곳에 사용
                                        //밑의 for 문에서 i 와 별개로 answer의 인덱스를 올려주는데 사용
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                answer[cnt] = i + 1;
                cnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Q18Number method = new Q18Number();
        int[] answers = new int[] {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(method.solution(answers)));
    }
}
//[1, 2, 3, 4, 5]   [1]
//[1, 3, 2, 4, 2]   [1, 2, 3]