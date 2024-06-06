package level3;

public class 최소_직사각형 {
    public int solution(int[][] sizes) {
        int maxx = 0;
        int maxy = 0;
        int x=0;
        int y=0;
        for(int[] i : sizes){
            x = Math.max(i[0],i[1]);
            y = Math.min(i[0],i[1]);
            maxx = Math.max(x,maxx);
            maxy = Math.max(y,maxy);
        }
        return maxx*maxy;
    }
}
