package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의_전당 {
    public static int[] solution(int k, int[] score) {
        List<Integer> li = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i =0;i<score.length;i++){
            if(li.size()<k){
                li.add(score[i]);
            }
            else if(score[i]>li.get(0)){
                li.set(0,score[i]);
            }
            Collections.sort(li);
            answer[i] = li.get(0);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(new String[]{Arrays.toString(solution(3,ans))}));
    }
}
