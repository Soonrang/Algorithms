import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
            int countZero = 0;
            int matchWin = 0;

            Set<Integer> winSet = new HashSet<>();
            for (int num : win_nums) {
                winSet.add(num);
            }

            for (int num : lottos) {
                if (num == 0) {
                    countZero++;
                } else if (winSet.contains(num)) {
                    matchWin++;
                }
            }

            answer[0] = getRank(matchWin + countZero);
            answer[1] = getRank(matchWin);

            return answer;
        }

        private int getRank(int count) {
            if (count == 6) return 1;
            else if (count == 5) return 2;
            else if (count == 4) return 3;
            else if (count == 3) return 4;
            else if (count == 2) return 5;
            else return 6;
    }
}
