package level2;

public class 최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int a = n*m;
        if(n<m){
            int c =n;
            n=m;
            m=c;
        }
        while(m!=0){
            int d = n%m;
            n=m;
            m=d;
        }
        int[] answer = {n,a/n};
        return answer;
    }
}
