import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
          int answer = 0;
        Integer[] sc = new Integer[score.length];
        for(int j=0; j< score.length; j++){
            sc[j] = score[j];
        }

        Arrays.sort(sc, Collections.reverseOrder());

        int cnt = m;
        for(int i=1; i<sc.length/cnt+1; i++){
            answer += sc[m*i-1]*cnt;
        }

       

        return answer;
    }
}