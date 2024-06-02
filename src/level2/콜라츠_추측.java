package level2;

public class 콜라츠_추측 {
    public int solution(int num) {
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
}
