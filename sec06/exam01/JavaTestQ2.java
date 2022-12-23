package sec06.exam01;

public class JavaTestQ2 {
    public void solution(int star) {
        for(int i = 0; i < star * 2 - 1; i++) {
            int spacecount = i < star ? i : (star - 1) * 2 - i;
            int starcount = (star - i) * 2 - 1 > 0 ? (star - i) * 2 - 1 : 2 * (i - star) + 3;
            System.out.println(" ".repeat(spacecount) + "*".repeat(starcount));
        }
    }

    public static void main(String[] args) {
        JavaTestQ2 method = new JavaTestQ2();
        int star = 7;
        method.solution(star);
    }
}