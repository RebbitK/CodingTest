package level3;

public class 시저_암호 {
    public String solution(String s, int n) {
        String answer = "";
        int num =0;
        char a;
        for(char c: s.toCharArray()){
            if(c!=' '){
                num=(int)c+n;
                if(64<(int)c&&(int)c<97&&num>90||96<(int)c&&num>122)
                    num-=26;
                answer += (char)num;
            }
            else{
                answer += c;
            }
        }
        return answer;
    }
}
