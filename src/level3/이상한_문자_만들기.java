package level3;

public class 이상한_문자_만들기 {
    public String solution(String s) {
        int i=0;
        String answer = "";
        for(char c : s.toCharArray()){
            if(c==' ')
            {
                i=1;
            }
            answer += i%2==0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
            i++;
        }
        return answer;
    }
}
