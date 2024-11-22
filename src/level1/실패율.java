package level1;

import java.util.*;
import java.util.stream.Collectors;

public class 실패율 {
	static public List<Integer> solution(int n, int[] stages) {
		HashMap<Integer, Integer> stageFailureCountMap = new HashMap<>();
		HashMap<Integer, Double> stageFailureMap = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			stageFailureCountMap.put(i, 0);
			stageFailureMap.put(i, 0.0);
		}

		for (int stage : stages) {
			if (stage == n + 1) {
				stageFailureCountMap.put(n, stageFailureCountMap.getOrDefault(n, 0) + 0);
				continue;
			}
			stageFailureCountMap.put(stage, stageFailureCountMap.getOrDefault(stage, 0) + 1);
		}

		int total = stages.length;
		for (int key : stageFailureCountMap.keySet()) {
			if (total == 0) {
				stageFailureMap.put(key, 0.0);
				continue;
			}
			stageFailureMap.put(key, (double) stageFailureCountMap.get(key) / total);
			total -= stageFailureCountMap.get(key);
		}

		List<Integer> answer = stageFailureMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey())
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
		return answer;
	}
}