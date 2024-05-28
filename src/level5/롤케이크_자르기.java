package level5;
import java.util.*;

public class 롤케이크_자르기 {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> map_1 = new HashMap<>();
        Map<Integer, Integer> map_2 = new HashMap<>();

        for (int e : topping) {
            map_2.put(e, map_2.getOrDefault(e, 0) + 1);
        }

        for (int e : topping) {
            map_1.put(e, map_1.getOrDefault(e, 0) + 1);

            if (map_2.get(e) - 1 == 0)
                map_2.remove(e);
            else
                map_2.put(e, map_2.get(e) - 1);

            if (map_1.size() == map_2.size())
                answer++;
        }

        return answer;
    }
}
