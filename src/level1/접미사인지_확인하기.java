package level1;

class 접미사인지_확인하기 {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		if(my_string.endsWith(is_suffix)){
			answer = 1;
		}
		return answer;
	}
}
