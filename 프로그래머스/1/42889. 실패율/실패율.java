import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challengers = new int[N + 2]; 
        
        for (int stage : stages) {
            challengers[stage]++;
        }
      
        HashMap<Integer, Double> failRate = new HashMap<>();
        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failRate.put(i, 0.0);
            } else {
                double failure = (double) challengers[i] / totalPlayers;
                failRate.put(i, failure);
                totalPlayers -= challengers[i];
            }
        }
        
      
        int[] answer = failRate.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .mapToInt(Map.Entry::getKey)
                .toArray();
        
        return answer;
    }
}