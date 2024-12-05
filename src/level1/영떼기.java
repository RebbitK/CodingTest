package level1;

class 영떼기 {
	public String solution(String n_str) {
		String answer = "";
		boolean leadingZeroFound = false;

		for (char c : n_str.toCharArray()) {
			if (c == '0' && !leadingZeroFound) {
				continue;
			}
			leadingZeroFound = true;
			answer += c;
		}

		return answer;
	}
}
