package sec06.exam01;

import java.util.PriorityQueue;

public class DefenseGame {
    public int solution(int n, int k, int[] enemy) {
        if(k >= enemy.length) {
            return enemy.length;
        }

        PriorityQueue<Integer> enemys = new PriorityQueue<>();

        for(int i = 0; i < k; i++) {
            enemys.add(enemy[i]);
        }
        int total = 0;
        int i;
        for(i = k; i < enemy.length; i++) {
            if (enemys.peek() < enemy[i]) {
                total += enemys.poll();
                enemys.add(enemy[i]);
            } else {
                total += enemy[i];
            }
            if(total > n) {
                break;
            }
        }


        return i;
    }




    public static void main(String[] args) {
        DefenseGame method = new DefenseGame();

        int n = 7;
        int k = 3;
        int[] enemy = new int[] {4, 2, 4, 5, 3, 3, 1};

        System.out.println(method.solution(n, k, enemy));
    }
}
