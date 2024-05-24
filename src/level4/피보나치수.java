package level4;

public class 피보나치수 {
    public static int solution(int n) {
        int nn = 0;
        int m = 1;
        int answer = 0;
        for(int i=1;i<n;i++){
            answer = (nn+m)%1234567;
            nn=m;
            m=answer;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
