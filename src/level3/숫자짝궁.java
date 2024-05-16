package level3;

import java.util.Arrays;

public class 숫자짝궁 {
    public static String solution(String X, String Y) {
        String answer = "";
        StringBuilder st = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(String xx : X.split("")){
            arrX[Integer.parseInt(xx)]++;
        }

        for(String yy : Y.split("")){
            arrY[Integer.parseInt(yy)]++;
        }

        for(int i=9; i>=0; i--){
            if(arrX[i]>0 && arrY[i]>0){
                int tm = Math.min(arrX[i], arrY[i]);
                for(int j=0; j<tm; j++){
                    st.append(i);
                }
            }
        }

        if (st.length()>0){
            answer = st.charAt(0)=='0'? "0": st.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("100","2345"));
    }
}
