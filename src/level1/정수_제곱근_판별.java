package level1;

import java.util.Arrays;

public class 정수_제곱근_판별 {
    public static long solution(long n) {
        if(Math.sqrt(n)==(int)(Math.sqrt(n)))
            return (long)(Math.pow(Math.sqrt(n)+1,2));
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(4000));
    }
}
