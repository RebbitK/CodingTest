package level2;
import java.util.*;

public class 나누어_떨어지는_숫자 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arlt = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                arlt.add(arr[i]);
            }
        }
        if(arlt.size()==0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arlt.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arlt.get(i);
        }
        Arrays.sort(answer);
        return answer;

    }
}
