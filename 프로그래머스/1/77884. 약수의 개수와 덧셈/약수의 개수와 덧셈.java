import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

           ArrayList<Integer> turnList = new ArrayList<>();
           int turnNumber = right-left+1;
           int curNumber = left;

           for(int i=0; i<turnNumber; i++){
               for (int j=1; j<=curNumber; j++){
                   if(curNumber%j==0){
                       turnList.add(j);
                   }
               }
               if(turnList.size()%2==0){
                   answer+=curNumber;
               }else{
                   answer-=curNumber;
               }
               //System.out.println(i+"번째: "+answer);
               //System.out.println(i+"번째: "+ turnList);
               turnList.removeAll(turnList);
               curNumber += 1;
           }
           return answer;
    }
}