class Solution {
    public int solution(int[] numbers) {
        int answer = -1;

        for(int i=0; i< numbers.length; i++){
            answer += numbers[i];
        }
       return 44-answer;
    }
}