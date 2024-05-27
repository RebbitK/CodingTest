package level5;

public class 멀쩡한_사각형 {
    public long solution(int w, int h) {
        long answer = 0;
        long x = (long)w;
        long y = (long)h;

        for(int i=1;i<w;i++){
            answer += y*i/x ;
        }

        return answer*2;
    }
}
