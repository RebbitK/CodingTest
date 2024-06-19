package level1;

public class 나머지가_1 {
    public int solution(int n) {
        int answer = 0;
        for(int i =n;i>0;i--){
            if((n)%i==1){
                answer = i;
            }
        }
        return answer;
    }
}
