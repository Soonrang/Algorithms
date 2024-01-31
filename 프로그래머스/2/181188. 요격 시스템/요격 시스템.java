import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
            Arrays.sort(targets,(t1,t2) -> {return t1[1]-t2[1];});
            //System.out.println(Arrays.deepToString(targets));

            int isTrue = -1;

            //iter 단축
            for (int[] target : targets) {
                if(isTrue == -1){
                    answer++;
                    isTrue = target[1];
                }
                if(target[0] < isTrue && target[1] >= isTrue) continue;
                answer++;
                isTrue = target[1];
            }
            return answer;
    }
}