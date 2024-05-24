package level4;

import java.util.Arrays;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int count = citations.length - i;
            if (count <= citations[i]) {
                answer = count;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ans = {2,6,8,14};
        System.out.println(solution(ans));
    }
}
