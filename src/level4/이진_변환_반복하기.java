package level4;

import java.util.Arrays;

public class 이진_변환_반복하기 {
    public static int[] solution(String s) {
        int[] answer = {0,0};
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    answer[1]++;
                }
            }
            s = s.replaceAll("0","");
            answer[0]++;
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution("110010101001"))));
    }
}
