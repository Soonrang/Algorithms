class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            int num = -1;
            
            for(int i=0; i<s.length(); i++){
                // s[i] 인덱스 (현재값)
                // arrList > s[i] 문자열과 같은 문자가 있는 위치 List
                for(int j=0; j<s.length(); j++){
                   if(i>j&&s.charAt(i)==s.charAt(j)){
                    num =(i-j);
                   }
                }
                answer[i] = num;
                num = -1;
            }
            return answer;
        }
    }