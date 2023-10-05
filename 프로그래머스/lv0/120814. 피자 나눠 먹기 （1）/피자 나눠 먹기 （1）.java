class Solution {
    public int solution(int n) {
        int answer = 1; 
        if(n>8){
             answer = (int) Math.ceil((double) n / 7) ;
            }
        return answer;
    }
}