package level1;
import java.util.*;
public class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> sk = new Stack<>();
        for(int m:moves){
            for(int i=0;i<board.length;i++){
                if(board[i][m-1]!=0){
                    sk.push(board[i][m-1]);
                    board[i][m-1]=0;
                    break;
                }
            }
            if(sk.size()>=2&&sk.get(sk.size()-1)==sk.get(sk.size()-2)){
                sk.pop();
                sk.pop();
                answer+=2;
            }
        }
        return answer;
    }
}
