package level1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        int a = s.length();
        if(a%2==0){
            return s.substring(a/2-1,a/2+1);
        }
        else{
            return s.substring(a/2,a/2+1);
        }
    }
}
