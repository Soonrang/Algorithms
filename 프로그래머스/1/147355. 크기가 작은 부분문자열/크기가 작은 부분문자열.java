import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        ArrayList<String> arrList = new ArrayList<>();

       
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String subStr = t.substring(i, i + p.length());
            arrList.add(subStr);
        }

        for (int j = 0; j < arrList.size(); j++) {
            try {
                if (Long.parseLong(arrList.get(j)) <= Long.parseLong(p)) {
                    answer++;
                }
            } catch (NumberFormatException e) {
               
            }
        }
        return answer;
    }
}
