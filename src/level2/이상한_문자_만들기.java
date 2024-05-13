package level2;

public class 이상한_문자_만들기 {
    public static String solution(String s) {
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
    public static void main(String[] args) {
        System.out.println(solution("hEllo woRld!"));
    }
}
