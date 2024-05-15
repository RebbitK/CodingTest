package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사_완전탐색 {
    public static Integer[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] count ={0,0,0};
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<answers.length;i++){
            if(one[i%5]==answers[i]){
                count[0]++;
            }
            if(two[i%8]==answers[i]){
                count[1]++;
            }
            if(three[i%10]==answers[i]){
                count[2]++;
            }
        }
        for(int i=0;i<3;i++){
            if(Arrays.stream(count).max().getAsInt()==count[i]){
                li.add(i+1);
            }
        }
        Integer[] answer = li.toArray(new Integer[li.size()]);
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {1,3,2,4,2};
        System.out.println(Arrays.toString(new String[]{Arrays.toString(solution(ans))}));
    }
}
