class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       String answer = "";
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < goal.length) {
            if (j < cards1.length && goal[i].equals(cards1[j])) {
                i++;
                j++;
            } else if (k < cards2.length && goal[i].equals(cards2[k])) {
                i++;
                k++;
            } else {
                answer = "No"; 
                break; 
            }
        }
        
        if (i == goal.length) {
            answer = "Yes"; 
        }
        
        return answer;
    }
}
