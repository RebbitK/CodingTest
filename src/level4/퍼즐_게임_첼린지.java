package level4;

public class 퍼즐_게임_첼린지 {
	public int solution(int[] diffs, int[] times, long limit) {
		int answer = 0;
		int min = 1;
		int max = 300000;
		while(max>min){
			answer = (max+min)/2;
			if(check(diffs,times,limit,answer)){
				max = answer;
			}
			else{
				min = answer+1;
			}
		}
		System.out.println(min);
		return max;
	}

	public static boolean check(int[] diffs, int[] times, long limit, int level){
		long time = 0;
		for(int i =0;i<diffs.length;i++){
			if(diffs[i]>level){
				if(i>0){
					time+= (times[i]+times[i-1])*(diffs[i]-level)+times[i];
				}
				else{
					time += (times[i])*(diffs[i]-level)+times[i];
				}
			}
			else{
				time += times[i];
			}
		}
		return limit>=time ? true : false;
	}

}
