package sec06.exam01;

public class TestQ5 {
    public void solution(int star) {
        for(int i = 0; i < star; i++) {
            System.out.println(" ".repeat(star - i - 1) + "*".repeat(i * 2 + 1));
        }
    }

    public static void main(String[] args) {
        TestQ5 method = new TestQ5();
        int star = 9;
        method.solution(star);
    }
}
//3
//  *
// ***
//*****
