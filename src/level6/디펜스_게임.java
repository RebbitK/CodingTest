package level6;
import java.util.*;

public class 디펜스_게임 {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.add(enemy[i]);

            if (my < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}
