import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
            int[][] tempSizes = new int[sizes.length][2];
            for (int i = 0; i < sizes.length; i++) {
                Arrays.sort(sizes[i]);
                tempSizes[i] = sizes[i];
            }

            int maxHorizontal = Integer.MIN_VALUE;
            int maxVertical = Integer.MIN_VALUE;

            for (int j = 0; j < tempSizes.length; j++) {
                int horizontal = tempSizes[j][0];
                int vertical = tempSizes[j][1];

                if (horizontal > maxHorizontal) {
                    maxHorizontal = horizontal;
                }

                if (vertical > maxVertical) {
                    maxVertical = vertical;
                }
            }
            return maxHorizontal * maxVertical;
    }
}