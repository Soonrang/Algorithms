class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
         int answer = 0;
           int minusNum = 0;

           for(int i=0; i<absolutes.length; i++){
               if(signs[i] == false){
                   minusNum += absolutes[i];
               }else {
                   answer += absolutes[i];
               }
           }

           return answer-minusNum;
    }
}