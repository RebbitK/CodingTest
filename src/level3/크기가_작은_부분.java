package level3;

public class 크기가_작은_부분 {
    public int solution(String t, String p) {
        int answer = 0;
        String a="";
        for(int i=0;i<=t.length()-p.length();i++){
            a= t.substring(i,i+p.length());
            if(p.compareTo(a)>-1)
                answer++;
        }
        return answer;
    }
}
