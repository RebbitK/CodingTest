package level3;

public class 숫자_문자열과_영단어 {
    public int solution(String s) {
        int i=0;
        String[] check = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(String ch : check){
            s = s.replace(ch,Integer.toString(i));
            i++;
        }

        return Integer.parseInt(s);
    }
}
