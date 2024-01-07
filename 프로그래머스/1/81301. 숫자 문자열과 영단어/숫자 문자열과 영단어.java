import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
            boolean hasEnglish = true;

            Map<String, Integer> number = new HashMap<>();
            number.put("zero",0);
            number.put("one",1);
            number.put("two",2);
            number.put("three",3);
            number.put("four",4);
            number.put("five",5);
            number.put("six",6);
            number.put("seven",7);
            number.put("eight",8);
            number.put("nine",9);

            for (Map.Entry<String, Integer> entry : number.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                s = s.replace(key, String.valueOf(value));
            }

            try {
                answer = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            return answer;
    }
}