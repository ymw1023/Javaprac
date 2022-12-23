package sec06.exam01;

import java.time.LocalDate;
import java.util.Scanner;

public class Q2016Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.of(2016, sc.nextInt(), sc.nextInt());
        System.out.println(date.getDayOfWeek().toString().substring(0, 3));
    }
}
//속도는 별로 안빠름 ㅠㅠ