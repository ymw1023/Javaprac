package sec06.exam01;

public class Q33Number {    //체육복
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];

        for(int i = 1; i < students.length; i++) {//요소를 1로 초기화 해서
            students[i]++;                      //모든 학생들이 체육복을 들고 있음을 표시
        }                                       //students의 요소는 해당 번호의 사람이 들고있는 체육복의 갯수
        for(int i = 0; i < lost.length; i++) {
            students[lost[i]]--;    // 잃어 버린 학생의 요소를 0으로 만듬
        }
        for(int i = 0; i < reserve.length; i++) {
            students[reserve[i]]++;     // 여분의 옷을 가져온 학생의 요소를 1 증가 시킴
        }
        //위의 과정을 거치면서 만약 여분을 가져온 학생이 잃어 버렸다면 +1 -1 되었기 때문에
        //여분을 가져온 학생이 잃어버리는 경우는 자동으로 해결이 됨
        for(int i = 1; i < students.length; i++) {
            if(students[i] == 0) {
                if(students[i - 1] == 2) {  //내 앞번호의 사람부터 빌리는 이유는 나중에 나보다 번호가 큰사람이
                    students[i]++;          //나보다 번호 1 큰사람의 체육복을 빌려야 하는 상황이 올수도 있기 때문
                    students[i - 1]--;      //작은번호 부터 큰 번호 순으로 순서대로 빌린다고 생각하면 편함
                } else if(i < students.length - 1 && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        int answer = n;
        for(int i = 1; i < students.length; i++) {
            if(students[i] == 0) {  //체육복의 갯수가 0개이면 1명 감소
                answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q33Number method = new Q33Number();
        int n = 5;
        int[] lost = new int[] {2, 4};
        int[] reserve = new int[] {3};
        System.out.println(method.solution(n, lost, reserve));
    }
}
//5    [2, 4]    [1, 3, 5]    5
//5    [2, 4]    [3]          4
//3    [3]       [1]          2

