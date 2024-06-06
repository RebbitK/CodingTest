package level3;

public class 푸트_파이터_대회 {
    public String solution(int[] food) {
        String answer = "0";
        for(int i=food.length-1;i>=0;i--){
            if(food[i]/2!=0){
                for(int j=0;j<food[i]/2;j++){
                    answer = i + answer + i;
                }
            }
        }
        return answer;
    }
}
