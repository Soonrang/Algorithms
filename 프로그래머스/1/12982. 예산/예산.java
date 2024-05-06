import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
//            ArrayList<Integer> de = new ArrayList<>();
//            for (int i=0; i<d.length; i++) {
//                de.add(d[i]);
//            }

            Arrays.sort(d);

            for(int j=0; j<d.length; j++){
                if(0<=(budget-d[j])){
                    budget-=d[j];
                    answer++;
                }else if(0>(budget-d[j])){
                    break;
                }
            }

            return answer;
    }
}