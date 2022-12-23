package sec06.exam01;

public class TestQ4 {
    public void solution(int N) {
        int count = 0;

        while(N >= 3) {
            if(N % 5 == 0) {
                count = count + N / 5;
                N = 0;
                break;
            }
            N -= 3;
            count++;
        }

        if(N > 0) {
            count = -1;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        TestQ4 method = new TestQ4();
        int N = 2;
        method.solution(N);
    }
}
//18   4
//4    -1
//11   3
//21   5

//57   13
//2    -1
