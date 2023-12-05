import java.util.*;


class Solution {
    public String solution(String[] survey, int[] choices) {
         String answer = "";
           //int currentScore = 0;
           Map<String,Integer> testMap = new HashMap<>();
           testMap.put("R",0);
           testMap.put("T",0);
           testMap.put("C",0);
           testMap.put("F",0);
           testMap.put("J",0);
           testMap.put("M",0);
           testMap.put("A",0);
           testMap.put("N",0);

           for(int i=0; i<survey.length; i++) {
               //currentScore = countTest(choices[i]);
               String leftChar = String.valueOf(survey[i].charAt(0));
               String rightChar = String.valueOf(survey[i].charAt(1));
               // 비동의 1~3 (왼쪽 유형)
               if (choices[i] < 4 && choices[i] > 0) {
                   int currentScore = countTest(choices[i]);
                   testMap.compute(leftChar, (key, value) ->  value + currentScore);
               } else if (choices[i] > 4) {
                   int currentScore = countTest(choices[i]);
                   testMap.compute(rightChar, (key, value) ->  value + currentScore);
               }
           }

           int rValue = testMap.getOrDefault("R",0);
           int tValue = testMap.getOrDefault("T",0);
           int cValue = testMap.getOrDefault("C",0);
           int fValue = testMap.getOrDefault("F",0);
           int jValue = testMap.getOrDefault("J",0);
           int mValue = testMap.getOrDefault("M",0);
           int aValue = testMap.getOrDefault("A",0);
           int nValue = testMap.getOrDefault("N",0);

           if(rValue>tValue){
               answer += "R";
           }else if(rValue==tValue){
               answer += "R";
           }else{
               answer += "T";
           }

           if(cValue>fValue){
               answer += "C";
           }else if(cValue==fValue){
               answer += "C";
           }else{
               answer += "F";
           }

           if(jValue>mValue){
               answer += "J";
           }else if(jValue==mValue){
               answer += "J";
           }else{
               answer += "M";
           }

           if(aValue>nValue){
               answer += "A";
           }else if(aValue==nValue){
               answer += "A";
           }else{
               answer += "N";
           }

           return answer;
       }

       public static int countTest(int choice){
           int plus = 0;
           switch (choice){
               case 1: plus += 3; break;
               case 2: plus += 2; break;
               case 3: plus += 1; break;
               case 4: plus += 0; break;
               case 5: plus += 1; break;
               case 6: plus += 2; break;
               case 7: plus += 3; break;
           }
           return plus;
       }
   }