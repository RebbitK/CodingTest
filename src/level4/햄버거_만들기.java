package level4;

import java.util.ArrayList;
import java.util.List;

public class 햄버거_만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> li = new ArrayList<>();
        int num = 0;
        for(int i : ingredient){
            li.add(i);
            while(li.size()>=4){
                num = li.size();
                if(!(li.get(num-1) == 1 && li.get(num-2)==3 && li.get(num-3) ==2 && li.get(num-4)==1)) {
                    break;
                }
                for(int j=0; j<4; j++) {
                    li.remove(li.size() -1);
                }
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ans));
    }
}
