package level1;

class 접두사인지_확인하기 {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;
		if(my_string.startsWith(is_prefix)){
			answer = 1;
		}
		return answer;
	}
}
