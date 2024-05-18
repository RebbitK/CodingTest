package level4;

import java.util.Arrays;

public class 바탕화면_정리 {
    public static int[] solution(String[] wallpaper) {
        int lux = 51;
        int luy = 51;
        int rdx = 0;
        int rdy = 0;
        for(int i=0; i<wallpaper.length;i++){
            for(int j=0; j<wallpaper[0].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(solution(ans)));
    }
}
