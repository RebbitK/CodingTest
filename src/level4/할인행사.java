package level4;

public class 할인행사 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for(int i=0; i<discount.length-9; i++) {
            int go = 0;
            for(int j=0; j<want.length; j++) {
                int count = 0;
                for(int k=i; k<i+10; k++) {
                    if(discount[k].equals(want[j])) count++;
                }
                if(count<number[j]){
                    break;
                }
                else {
                    go++;
                }
            }
            if(go == want.length) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"banana", "apple", "rice", "pork", "pot"};
        int[] ans2 = {3,2,2,2,1};
        String[] ans3 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(ans,ans2,ans3));
    }
}
