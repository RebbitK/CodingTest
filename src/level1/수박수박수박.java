package level1;

import java.util.Arrays;

public class 수박수박수박 {
    public static String solution(int n) {
        String answer = "";
        char[] 수박 = {'수','박'};
        for(int i=2;i<=n+1;i++){
            answer += 수박[i%2];
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println((solution(100)));
    }
}
