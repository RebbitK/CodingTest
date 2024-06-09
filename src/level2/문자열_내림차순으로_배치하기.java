package level2;
import java.util.*;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String answer = String.valueOf(a);
        StringBuffer st = new StringBuffer(answer);
        return st.reverse().toString();
    }
}
