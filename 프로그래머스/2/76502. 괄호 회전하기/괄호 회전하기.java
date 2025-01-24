import java.util.ArrayDeque;

class Solution {
    public int solution(String s) {
       int answer = 0;

        StringBuilder str = new StringBuilder();
        str.append(s);
        
//        if (checkCorrect(str.toString())) {
//            answer++;
//        }

        for (int i = 0; i < s.length(); i++) {
            str.append(str.charAt(0));
            str.deleteCharAt(0);

            if (checkCorrect(str.toString())) {
                answer++;
            }
        }

        return answer;
    }

    private static boolean checkCorrect(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}