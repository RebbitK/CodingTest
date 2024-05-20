package level4;

import java.util.Stack;

public class 괄호_회전하기 {
    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> st = new Stack<>();
            String ss = s.substring(i, s.length());
            ss += s.substring(0, i);
            for (int j = 0; j < ss.length(); j++) {
                char ch = ss.charAt(j);
                if (st.isEmpty()) {
                    st.push(ch);
                } else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
            if (st.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}


