import java.util.HashMap;

class Solution {
    public int[] solution(int[] numbers) {
       HashMap<Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp.put(numbers[i] + numbers[j], 0); 
            }
        }

        int[] result = temp.keySet()
                .stream()
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        return result;
    
    }
}