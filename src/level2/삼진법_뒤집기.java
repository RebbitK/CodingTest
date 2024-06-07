package level2;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        String nnn = Integer.toString(n,3);
        StringBuffer sb = new StringBuffer(nnn);
        String ren = sb.reverse().toString();
        return Integer.parseInt(ren,3);
    }
}
