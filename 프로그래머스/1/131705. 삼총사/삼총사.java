class Solution {
    public int solution(int[] number) {
        int sum = 0;
           int cnt =0;
           for (int i=0; i<number.length; i++){
               for (int j=i+1; j<number.length; j++){
                   for (int k=j+1; k<number.length; k++){
                      sum += number[i] + number[j] + number[k];
                      if(sum==0){
                          cnt++;
                      }
                      sum = 0;
                   }
               }
           }
           return cnt;
    }
}