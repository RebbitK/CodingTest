package level2;

public class 약수의_갯수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for(int i=left;i<=right;i++){
            for(int j=1;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    if(i/j!=j){
                        count++;
                    }
                }
            }
            if(count%2==0){
                answer+=i;
            }
            else{
                answer-=i;
            }
            count=0;
        }
        return answer;
    }
}
