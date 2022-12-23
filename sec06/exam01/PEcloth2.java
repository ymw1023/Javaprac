package sec06.exam01;

public class PEcloth2 {
    public static void main(String[] args) {
        int[] lost = new int[]{3};
        int[] reserve = new int[]{1};
        int n = 3;

        byte[] students = new byte[n + 2];

        for(int losts: lost) {
            students[losts]--;
        }
        for(int reserves: reserve) {
            students[reserves]++;
        }

        int answer = students.length - 2;
        for(int i = 1; i <= n; i++) {
            if(students[i] == 0) {
                if(students[i - 1] == 0) { //나보다 번호 작은애한테 빌림
                    students[i - 1]--;
                    students[i]++;
                } else if(students[i + 1] == 0) {    //나보다 번호 큰애한테 빌림
                    students[i + 1]--;
                    students[i]++;
                } else {    //못빌림
                    answer--;
                }
            }
        }
        System.out.println(answer);
    }
}
