package level3;

import java.util.*;
public class 두_개_뽑아서_더하기 {
    public Integer[] solution(int[] numbers) {
        Set<Integer> s = new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = s.toArray(new Integer[0]);
        return answer;
    }
}
