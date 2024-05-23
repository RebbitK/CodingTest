package level4;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static int solution(String[][] clothes) {
        Map<String, Integer> cl = new HashMap<>();
        int answer = 1;
        for(int i = 0; i < clothes.length; i++) {
            String my = clothes[i][1];
            cl.put(my, cl.getOrDefault(my, 0) + 1);
        }

        for(String s : cl.keySet()) {
            answer *= (cl.get(s) + 1);
        }
        answer -= 1;
        return answer;
    }
    public static void main(String[] args) {
        String[][] ans = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(ans));
    }
}
