class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
            int nSize = str.length();
            int[] answer = new int[str.length()];
            int minusNum = 1;
            
            for (int i =0; i< nSize; i++){
                String currentNum = String.valueOf(str.charAt(nSize-minusNum));
                answer[i] = Integer.parseInt(currentNum);
                minusNum++;
                //System.out.println(answer[i]);
            }

            return answer;
    }
}