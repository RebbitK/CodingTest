package level2;
import java.util.regex.Pattern;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6){
            answer = Pattern.matches("^[0-9]*$",s);
        }
        return answer;
    }
}

