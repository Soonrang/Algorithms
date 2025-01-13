import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
            Map<Integer, Integer> countFail = new HashMap<>();

            //각 스테이지별 실패자 수
            for (int i = 0; i < stages.length; i++) {
                countFail.put(stages[i], countFail.getOrDefault(stages[i], 0) + 1);
            }

            System.out.println(countFail);
            //{1=1, 2=3, 3=2, 4=1, 6=1}

            Map<Integer, Double> failure = new HashMap<>();
            int challengers = stages.length;

          for (int j = 1; j <= N; j++) {
            double failChallengers = countFail.getOrDefault(j, 0);

            if (challengers > 0) {
                failure.put(j, failChallengers / challengers);
                challengers -= failChallengers;
            } else {
                failure.put(j, 0.0); 
            }
        }

            System.out.println("failure: " + failure);
            return failure.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Double.compare(b.getValue(), a.getValue()); 
                    if (cmp == 0) return Integer.compare(a.getKey(), b.getKey());
                    return cmp;
                })
                .mapToInt(Map.Entry::getKey) 
                .toArray();
    }
}