package level4;

import java.util.Arrays;

public class JadenCase_문자열_만들기 {
    public static String solution(String s) {
        String[] ss = s.split("\\s");
        String answer = "";
        for(String st: ss){
            if(st.length()==0){
                answer += " ";
            }
            else{
                answer += st.substring(0, 1).toUpperCase();
                answer += st.substring(1, st.length()).toLowerCase();
                answer += " ";
            }


        }
        answer=answer.substring(0,answer.length()-1);
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            System.out.println("test");
            answer += " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println((solution("3people unFollowed me")));
    }
}
