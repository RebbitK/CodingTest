package level4;
import java.util.*;

public class 요격_시스템 {
	public int solution(int[][] targets) {
		int answer = 0;
		int m = 0;
		Arrays.sort(targets,(x,y)->x[1]-y[1]);
		for(int i=0;i<targets.length;i++){
			if(m>targets[i][0]){
				continue;
			}
			m = targets[i][1];
			answer++;
		}
		return answer;
	}
}
