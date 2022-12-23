package sec06.exam01;

public class TestQ1 {
    public String date(int month, int day) {
        int[] months = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  //월

        day += 98;

        while(day > months[month - 1]) {
            day -= months[month - 1];
            month++;
            if(month == 13) {
                month = 1;
            }
        }

        return month + "월 " + day + "일";
    }

    public static void main(String[] args) {
        TestQ1 method = new TestQ1();
        System.out.println(method.date(11, 27));
    }
}