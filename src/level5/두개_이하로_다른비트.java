package level5;

import java.util.Arrays;

public class 두개_이하로_다른비트 {

    public static long[] solution(long[] numbers) {
        long[] answer = numbers.clone();
        for (int i = 0; i < numbers.length; i++) {
            answer[i]++;
            answer[i] += (answer[i] ^ numbers[i]) >> 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new long[]{2, 7})));
    }
}
