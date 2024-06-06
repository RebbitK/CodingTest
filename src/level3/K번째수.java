package level3;
import java.util.*;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> li = new ArrayList<Integer>();
        int j =0;
        for(int[] co : commands){
            for(int i=co[0]-1;i<co[1];i++){
                li.add(array[i]);
            }
            Collections.sort(li);
            answer[j]=li.get(co[2]-1);
            j++;
            li.clear();
        }
        return answer;
    }
}
