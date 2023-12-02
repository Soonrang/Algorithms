class Solution {
    public int solution(int a, int b, int n) {
         int countBottle = 0;
           int curBottle = 0;

           while (n >= a) {
               curBottle = ((int) Math.floor(n/a))*b;
               countBottle += curBottle;
               //System.out.println(countBottle);
               n = n + curBottle - a * ((int) Math.floor(n/a));
               //System.out.println(n);
           }

           return countBottle;
    }
}