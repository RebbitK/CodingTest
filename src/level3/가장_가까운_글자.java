package level3;
import java.util.*;
public class 가장_가까운_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> li = new ArrayList<String>();
        for(String ss: s.split("")){
            li.add(ss);
        }
        for(int i=0;i<li.size();i++){
            for(int j=i-1;j>=0;j--){
                if(li.get(i).equals(li.get(j))){
                    answer[i]=i-j;
                    break;
                }
            }
            if(answer[i]==0){
                answer[i]=-1;
            }
        }
        return answer;
    }
}
