package level4;

public class 성격_유형_검사하기 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] point = {0,0,0,0};
        for(int i=0;i<survey.length;i++){
            if(survey[i].equals("RT")){
                point[0]-=choices[i]-4;
            }
            else if(survey[i].equals("TR")){
                point[0]+=choices[i]-4;
            }
            else if(survey[i].equals("CF")){
                point[1]-=choices[i]-4;
            }
            else if(survey[i].equals("FC")){
                point[1]+=choices[i]-4;
            }
            else if(survey[i].equals("JM")){
                point[2]-=choices[i]-4;
            }
            else if(survey[i].equals("MJ")){

                point[2]+=choices[i]-4;
            }
            else if(survey[i].equals("AN")){
                point[3]-=choices[i]-4;
            }
            else if(survey[i].equals("NA")){
                point[3]+=choices[i]-4;
            }
        }
        if(point[0]>=0){
            answer+="R";
        }
        else
        {
            answer+="T";
        }
        if(point[1]>=0){
            answer+="C";
        }
        else
        {
            answer+="F";
        }
        if(point[2]>=0){
            answer+="J";
        }
        else
        {
            answer+="M";
        }
        if(point[3]>=0){
            answer+="A";
        }
        else
        {
            answer+="N";
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] ans = {"AN", "CF", "MJ", "RT", "NA"};
        int[] ans2 = {5, 3, 2, 7, 5};
        System.out.println(solution(ans,ans2));
    }
}
