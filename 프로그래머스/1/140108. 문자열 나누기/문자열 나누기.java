class Solution {
    public int solution(String s) {
        int answer = 1;

        char startStr = s.charAt(0);
        int cnt = 1;
        for (int i=1; i<s.length(); i++){
            if(cnt == 0){
                answer++;
                startStr = s.charAt(i);
            }

            if(startStr == s.charAt(i)){
                cnt++;
            } else {
                cnt--;
            }
        }
            return answer;
    }
}