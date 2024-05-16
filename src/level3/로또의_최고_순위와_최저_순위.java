package level3;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int tt = 0;
        for(int lo : lottos){
            if(lo==0){
                tt++;
            }
            for(int win : win_nums)
                if(lo==win){
                    count++;
                }
        }
        if(count<2){
            answer[1]=6;
        }
        else{
            answer[1]=7-count;
        }
        answer[0]=7-tt-count;
        if(answer[0]<1){
            answer[0]=1;
        }
        if(answer[0]>6){
            answer[0]=6;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {44, 1, 0, 0, 31, 25};
        int[] ans2 = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.deepToString(new int[][]{solution(ans, ans2)}));
    }
}
