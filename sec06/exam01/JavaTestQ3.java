package sec06.exam01;

public class JavaTestQ3 {
    public static int solution(int beer) {
        int answer = 0;

        while(beer >= 10) {
            answer += beer / 10;
            beer = beer / 10 + beer % 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        int beer = 9911;
        System.out.println(JavaTestQ3.solution(beer));
    }
}