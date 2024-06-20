package level1;
import java.util.*;
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count =0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i =0; i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    reserve[j]=n+2;
                    lost[i]=-10;
                    count++;
                }
            }
        }
        for(int lo : lost){
            for(int i=0;i<reserve.length;i++){
                if(lo+1>=reserve[i]&&reserve[i]>=lo-1){
                    count++;
                    reserve[i]=n+2;
                    break;
                }
            }
        }
        return n-lost.length+count;
    }
}
