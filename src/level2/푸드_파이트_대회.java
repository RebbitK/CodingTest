package level2;

import java.util.Arrays;

public class 푸드_파이트_대회 {
    public static String solution(int[] food) {
        String answer = "0";
        for(int i=food.length-1;i>=0;i--){
            if(food[i]/2!=0){
                for(int j=0;j<food[i]/2;j++){
                    answer = i + answer + i;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {1,5,6,7,8,9};
        System.out.println(Arrays.toString(new String[]{solution(ans)}));
    }
}
