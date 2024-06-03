package level3;

public class a2016년 {
    public String solution(int a, int b) {
        int[] moon = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int ans = 0;
        for(;a>1;a--){
            ans += moon[a-2];
        }
        ans+=b;
        System.out.println(ans);
        return week[ans%7];
    }
}
