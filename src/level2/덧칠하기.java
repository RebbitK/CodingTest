package level2;

import java.util.Arrays;

public class 덧칠하기 {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] count = new int[n];
        for(int i : section){
            count[i-1]=1;
        }
        for(int i=0;i<n;i++){
            if(count[i]==1){
                System.out.println(i);
                for(int j=i;j<i+m;j++){
                    if(j==n){
                        break;
                    }
                    count[j]=0;
                }
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {2, 3, 6};
        System.out.println(Arrays.toString(new String[]{String.valueOf((solution(8,4,ans)))}));
    }
}
