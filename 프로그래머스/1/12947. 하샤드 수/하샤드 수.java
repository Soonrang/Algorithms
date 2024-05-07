class Solution {
    public boolean solution(int x) {
        boolean answer = true;

            String str = Integer.toString(x);
            int result = 0;
            for(int i=0; i<str.length(); i++){
                result+= Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            if(x%result!=0){
                answer=false;
            }
            return answer;
    }
}