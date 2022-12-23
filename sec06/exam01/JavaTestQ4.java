package sec06.exam01;

public class JavaTestQ4 {
    public static void solution(int N,int X,int Y,int R) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i == X && j == Y) {
                    System.out.print("x ");
                    continue;
                }
                int distance = Math.abs(X - i) + Math.abs(Y - j);
                System.out.print((distance <= R ? distance : 0) + " ");
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        int N = 8;
        int X = 4;
        int Y = 3;
        int R = 4;

        JavaTestQ4.solution(N,X,Y,R);
    }
}
