package level2;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        int search = 0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].contains("Kim")==true)
                search=i;
        }
        String answer = "김서방은 " + search +"에 있다";
        return answer;
    }
}
