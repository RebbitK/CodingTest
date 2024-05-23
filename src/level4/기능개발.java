package level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < speeds.length; i++){
            if ((100 - progresses[i]) % speeds[i] != 0){
                q.add((100 - progresses[i]) / speeds[i]+1);
                continue;
            }
            q.add((100 - progresses[i]) / speeds[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int d = q.poll();
            int cnt = 1;

            while (!q.isEmpty() && d >= q.peek()) {
                cnt++;
                q.poll();
            }
            list.add(cnt);
        }
        int[] answer = new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {93,30,55};
        int[] ans2 = {1,30,5};
        System.out.println(Arrays.toString(solution(ans, ans2)));
    }
}
