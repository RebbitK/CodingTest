package level4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<players.length;i++){
            m.put(players[i],i);
        }
        for(String call: callings){
            int num = m.get(call);
            String change = players[num-1];
            m.replace(change,num);
            players[num] = change;
            m.replace(call,num-1);
            players[num-1] = call;
        }
        for(Map.Entry<String, Integer> e : m.entrySet()) {
            answer[e.getValue()] = e.getKey();
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"mumu", "soe", "poe", "kai", "mine"};
        String[] ans2 = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(ans, ans2)));
    }

}
