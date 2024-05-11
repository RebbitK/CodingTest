package level1;

import java.util.Arrays;

class 자연수_뒤집어서_배열_만들기 {
    public static int[] solution(long n) {
        String in = ""+n;
        int[] answer = new int[in.length()];
        for(int i=0;i<answer.length;i++){
            answer[i] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(123456)));
    }
}