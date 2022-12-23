package sec06.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class PEcloth {
    public static void main(String[] args) {
        int[] lost = new int[]{3};
        int[] reserve = new int[]{1};
        int n = 3;

        ArrayList<Integer> losts = (ArrayList<Integer>) Arrays.stream(lost).boxed().collect(Collectors.toList());
        ArrayList<Integer> reserves = (ArrayList<Integer>) Arrays.stream(reserve).boxed().collect(Collectors.toList());

        Collections.sort(losts);
        Collections.sort(reserves);
        outer: for(int i = 0; i < losts.size(); i++) {  //감사합니다!!
            for(int j = 0; j < reserves.size(); j++) {
                if(losts.get(i) == reserves.get(j)) {
                    losts.remove(i);
                    reserves.remove(j);
                    i--;
                    continue outer;
                } else if(losts.get(i) == reserves.get(j) + 1) {
                    losts.remove(i);
                    reserves.remove(j);
                    i--;
                    continue outer;
                } else if(losts.get(i) == reserves.get(j) - 1) {
                    losts.remove(i);
                    reserves.remove(j);
                    i--;
                    continue outer;
                }
            }
        }

        System.out.println(n - losts.size());
    }
}
// n = 5
// lost = [2, 4]
// reserve = [1, 3, 5]