package level3;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i=0;
        int j=0;
        for(String s: goal){
            if(i<cards1.length&&cards1[i].equals(s)){
                answer="Yes";
                i++;
            }
            else if(j<cards2.length&&cards2[j].equals(s)){
                answer="Yes";
                j++;
            }
            else{
                answer="No";
                break;
            }
        }
        return answer;
    }
}
