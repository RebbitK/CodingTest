package level3;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> keys = new HashMap<>();

        for(int i =0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                int value = keys.getOrDefault(keymap[i].charAt(j),-1);
                if(value<0||value>j){
                    keys.put(keymap[i].charAt(j),j+1);
                }
            }
        }
        int[] answer = new int[targets.length];
        for(int i =0;i<targets.length;i++){
            int ans = 0;
            for(int j=0;j<targets[i].length();j++){
                int check = keys.getOrDefault(targets[i].charAt(j),-1);
                if(check<0){
                    ans=-1;
                    break;
                } else {
                    ans += check;
                }
            }
            answer[i]=ans;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"ABACD", "BCEFD"};
        String[] ans2 = {"ABCD","AABB"};
        System.out.println(Arrays.toString(solution(ans, ans2)));
    }
}
