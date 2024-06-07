package level2;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        double answer = count%2 ==0 ? money-(count/2+0.5)*count*price : money-(count/2+1)*count*price;
        return (long)answer>0 ? 0 : (long)-answer;
    }
}
