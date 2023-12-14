class Solution {
    public long solution(int price, int money, int count) {
            long answer = -1;
           long curPrice = 0;


           for(long i=1; i<=count; i++){
               curPrice += price*i;
           }
           
           long restMoney = money - curPrice;

           if(restMoney>=0){
               answer = 0;
           }else if (restMoney<0){
               answer = Math.abs(restMoney);
           }
           return answer;
    }
}