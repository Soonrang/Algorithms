import java.util.HashMap;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // Hint : HashMap을 이용하면 된다.
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keyList = new HashMap<>();

        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char currentKey = keymap[i].charAt(j);
                if(keyList.containsKey(currentKey)){
                    int index = keyList.get(currentKey);
                    keyList.put(currentKey,Math.min(index, j+1));
                }
                else {
                    keyList.put(currentKey,j+1);
                }
            }
        }

        for(int i=0; i<targets.length; i++){
            String target = targets[i];
            int cnt = 0;
            boolean flag = true;
            for(char currentKey : target.toCharArray()){
                if(keyList.containsKey(currentKey)){
                    cnt +=keyList.get(currentKey);
                }else{
                    flag=false;
                    break;
                }
            }

            answer[i] = flag == false ? -1 :cnt;
        }

        return answer;
    }
}