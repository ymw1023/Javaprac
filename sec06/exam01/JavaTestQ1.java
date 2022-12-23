package sec06.exam01;

public class JavaTestQ1 {
    public static void solution(int N, int M) {
        int count = 0;
        for(int i = N; i <= M; i++) {
            if(i % 2 == 1) {
                System.out.print(i + " ");
                count++;
                if(count == 4) {
                    System.out.print('\n');
                    count = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 115;
        int M = 134;
        JavaTestQ1.solution(N, M);
    }
}