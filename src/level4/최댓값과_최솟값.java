package level4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class 최댓값과_최솟값 {
    public static String solution(String s) {
        String[] ans = s.split(" ");
        Integer[] arr = Stream.of(ans).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        List<Integer> li =  Arrays.asList(arr);
        Collections.sort(li);
        String answer = li.get(0)+" "+li.get(li.size()-1);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }
}
