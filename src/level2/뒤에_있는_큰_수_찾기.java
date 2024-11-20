package level2;
import java.util.*;
public class 뒤에_있는_큰_수_찾기 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> st = new Stack<>();
		for(int i =0;i<numbers.length;i++){
			while(!st.isEmpty()&&numbers[st.peek()]<numbers[i]){
				answer[st.pop()] = numbers[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()){
			answer[st.pop()] = -1;
		}
		return answer;
	}

}
