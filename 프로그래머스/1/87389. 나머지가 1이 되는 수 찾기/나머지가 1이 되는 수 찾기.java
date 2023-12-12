class Solution {
    public int solution(int n) {
        int answer = 1;
           int rest = 0;

           while (rest>=0){
               if(n%answer == 1){
                   rest = -1;
               }
               answer++;
           }
           return answer-1;
    }
}