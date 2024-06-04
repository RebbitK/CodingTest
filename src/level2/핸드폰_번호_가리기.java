package level2;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i= phone_number.length()-5;i>=0;i--){
            answer += "*";
        }
        if(phone_number.length()>=4){
            answer = answer+phone_number.substring(phone_number.length()-4,phone_number.length());
        }
        return answer;
    }
}
