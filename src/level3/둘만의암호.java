package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 둘만의암호 {
    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<Character> li = new ArrayList<>();
        for(int i =0;i<26;i++){
            li.add((char)(i+97));
        }
        for(Character sk: skip.toCharArray()){
            li.remove(sk);
        }
        for(Character ss: s.toCharArray()){
            int ans = li.indexOf(ss);
            ans = (ans+index)%li.size();
            sb.append(li.get(ans));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("aukks","wbqd",5));
    }
}
