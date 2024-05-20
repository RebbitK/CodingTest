package level4;

public class n개의_최소_공배수 {
    public static int solution(int[] arr) {
        int answer = arr[0];
        if(arr.length==1){
            return answer;
        }
        int g = 0;
        for(int i=1;i<arr.length;i++){
            g = gcd(answer,arr[i]);
            answer = answer * arr[i] / g;
        }
        return answer;
    }
    public static int gcd(int x, int y) {
        int num = x % y;
        if(num == 0) {
            return y;
        }
        else{
            return gcd(y, num);
        }
    }
    public static void main(String[] args) {
        int[] ans = {2,6,8,14};
        System.out.println(solution(ans));
    }
}
