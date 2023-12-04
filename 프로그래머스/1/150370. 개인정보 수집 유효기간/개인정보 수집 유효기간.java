import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
           int count = 0;
           ArrayList<String> type = new ArrayList<>();
           ArrayList<Integer> typeMonth = new ArrayList<>();
           int todayDate = Integer.parseInt(today.replace(".",""));
           System.out.println("오늘 날짜: "+ todayDate);

           for(int k=0; k<terms.length; k++){
               String[] temp = terms[k].split(" ");
               type.add(temp[0]);
               typeMonth.add(Integer.parseInt(temp[1]));
           }

           for(int i=0; i<privacies.length; i++){
               String privaciesDate = privacies[i].substring(0,10);
               int privaciesYear = Integer.parseInt(privacies[i].substring(0,4));
               int privaciesMonth = Integer.parseInt(privacies[i].substring(5,7));
               int privaciesDay = Integer.parseInt(privacies[i].substring(8,10));
               String privaciesType = privacies[i].substring(11);

               int typeNumber = type.indexOf(privaciesType);
               
               privaciesMonth += typeMonth.get(typeNumber);
               
               while (privaciesMonth>12){
                   privaciesYear++;
                   privaciesMonth-=12;
               }

               if(privaciesDay ==1){
                   privaciesMonth--;
                   privaciesDay=28;
               }else if(privaciesDay<28){
                   privaciesDay = privaciesDay-1;
               }

               String thisMonth = Integer.toString(privaciesMonth);
               String thisDay= Integer.toString(privaciesDay);

               if(privaciesMonth<10){
                   thisMonth = "0"+ thisMonth;
               }

               if (privaciesDay<10) {
                   thisDay = "0" + thisDay;
                   System.out.println(thisDay);
               }
               privaciesDate = Integer.toString(privaciesYear) + thisMonth + thisDay;
               //System.out.println(privaciesYear);
               //System.out.println(privaciesMonth);
               //System.out.println(i+1+"번째 개인정보날짜: "+ privaciesDate);
               if(todayDate>Integer.parseInt(privaciesDate)){
                   answer[i] = i+1;
                   count++;
               }
           }
//
           int[] result = new int[count];
           ArrayList<Integer> finalResult = new ArrayList<>();
           for(int z=0; z<answer.length; z++){
               if(answer[z]!=0){
                   finalResult.add(answer[z]);
               }
           }

           for(int k=0; k<finalResult.size(); k++){
               result[k]= finalResult.get(k);
           }

           return result;
    }
}