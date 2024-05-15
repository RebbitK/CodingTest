package level2;

import java.util.Arrays;

public class 기사단원의무기 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            int count = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) count++;
                else if(i%j==0) count+=2;
            }
            if(count>limit){
                count=power;
            }
            answer+=count;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {2, 3, 6};
        System.out.println(Arrays.toString(new int[]{solution(5, 3, 2)}));
    }
}
