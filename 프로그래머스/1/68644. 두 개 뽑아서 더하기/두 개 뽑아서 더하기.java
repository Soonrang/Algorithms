import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int i,j,z=0;
        int cnt=0;
        HashSet<Integer> ar=new HashSet<Integer>();
        Arrays.sort(numbers);

    for(i=0;i<numbers.length;i++){
        for(j=0;j<numbers.length;j++){
            if(i!=j)
            ar.add((numbers[i]+numbers[j]));
        }
    }

int[] answer = new int[ar.size()];
Iterator iter=ar.iterator();
while(iter.hasNext())
answer[cnt++]=(int)iter.next();

Arrays.sort(answer);

        return answer;
    }
}