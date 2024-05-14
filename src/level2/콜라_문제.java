package level2;

public class 콜라_문제 {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while(a<=n){
            answer += n/a*b;
            n = n%a+n/a*b;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }
}
