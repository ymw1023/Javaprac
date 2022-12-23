package sec06.exam01;

public class TestQ3 {
    public String solution(String s) {
        String[] numberString = s.split(" ");
        int[] number = new int[numberString.length];
        int max = 0;
        for(int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(numberString[i]);
            max = Math.max(max, number[i]);
        }
        boolean[] mathNumber = new boolean[max + 1];

        mathNumber[1] = true;
        for(int i = 2; i * i <= max; i++) {
            if(mathNumber[i]) {
                continue;
            }
            for(int j = i * i; j <= max; j += i) {
                mathNumber[j] = true;
            }
        }
        max = 0;
        int min = 2147483647;

        for(int num: number) {
            if(mathNumber[num]) {
                min = Math.min(min, num);
            } else {
                max = Math.max(max, num);
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        TestQ3 method = new TestQ3();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}