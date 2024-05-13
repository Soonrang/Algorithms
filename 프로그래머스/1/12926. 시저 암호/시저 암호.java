class Solution {
    public String solution(String s, int n) {
        char[] carr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:carr) {
            char now;
            if(Character.isAlphabetic(c)) {
                if(Character.isUpperCase(c)) now=(char)((c-'A'+n)%26+'A');
                else now=(char)((c-'a'+n)%26+'a');
            }
            else now=c;
            sb.append(now);
        }
        return sb.toString();
    }
}