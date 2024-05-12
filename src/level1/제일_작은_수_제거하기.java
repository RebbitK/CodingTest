package level1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        int min = arr[0];
        for(int i : arr){
            min = Math.min(min,i);
        }
        int num = 0;
        int[] answer = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                continue;
            }
            answer[num++]=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ans = {1,5,6,7,8,9};
        System.out.println(Arrays.toString(solution(ans)));
    }
}
