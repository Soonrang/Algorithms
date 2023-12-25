import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

    ArrayList<Integer> numList = new ArrayList<>();

    
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                int curNumber = nums[i] + nums[j] + nums[k];
                numList.add(curNumber);
            }
        }
    }

   
    for (int num : numList) {
        boolean isPrime = true;

    
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

    
        if (isPrime) {
            answer++;
        }
    }

    return answer;
    }
}