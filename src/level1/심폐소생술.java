package level1;

class 심폐소생술 {
	public int[] solution(String[] cpr) {
		int[] answer = {0, 0, 0, 0, 0};
		String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

		for(int i=0; i<basic_order.length; i++){
			for(int j=0; j<cpr.length; j++){
				if(cpr[i].equals(basic_order[j])){
					answer[i] = j+1;
					break;
				}
			}
		}
		return answer;
	}
}