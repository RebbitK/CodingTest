package level1;

public class 하샤드수 {
    public static int solution(int num) {
        int answer = 0;
        long nm = num;
        if(num==1)
            return 0;
        else
            while(nm!=1){
                if(answer==499){
                    return -1;
                }
                else if(nm%2==0){
                    nm /= 2;
                }
                else{
                    nm = nm*3+1;
                }
                answer++;
            }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(4000));
    }
}
