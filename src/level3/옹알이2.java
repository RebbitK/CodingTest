package level3;

import java.util.Arrays;

public class 옹알이2 {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] babu = {"aya","ye","woo","ma"};
        for(String s: babbling){
            for(String b : babu){
                System.out.printf("'%s'\n",b);
                s=s.replace(b,"");
            }
            System.out.printf("'%s'\n",s);
            if(s.equals("")){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"aya", "yee", "u", "maa"};
        System.out.println(solution(ans));
    }
}
