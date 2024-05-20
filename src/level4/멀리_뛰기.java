package level4;

public class 멀리_뛰기 {
    public static long solution(int n) {
        long[] lo = new long[n+2];
        lo[0]=0;
        lo[1]=1;
        lo[2]=2;

        for(int i=3;i<=n;i++){
            lo[i]=(lo[i-1]+lo[i-2])%1234567;
        }
        return lo[n];
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
