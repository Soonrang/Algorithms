import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,Integer> reportIdList = new HashMap<>();
           Map<String,Integer> emailCount = new HashMap<>();

           // 신고횟수를 입력할 map 생성, 기본값 0
           for(String member : id_list) {
               reportIdList.put(member,0);
               emailCount.put(member,0);
           }


           // 중복요소 제거
           Set<String> reportUserSet = new HashSet<>(Arrays.asList(report));
           List<String> reportUser = new ArrayList<>(reportUserSet);


           for (String repo : reportUser) {
               String[] curReportUser = repo.split(" ");
               reportIdList.compute(curReportUser[1], (key, value) -> value + 1);
           }

           List<String> usersToNotify = new ArrayList<>();
           for (Map.Entry<String, Integer> entry : reportIdList.entrySet()) {
               if (entry.getValue() >= k) {
                   usersToNotify.add(entry.getKey());
               }
           }

           // 이메일 발송 기록 업데이트
           for (String repo : reportUserSet) {
               String[] curReportUser = repo.split(" ");
               if (usersToNotify.contains(curReportUser[1])) {
                   emailCount.compute(curReportUser[0], (key, value) -> value + 1);
               }
           }

           int[] answer = new int[id_list.length];
           for(int i=0; i<emailCount.size(); i++){
               answer[i] = emailCount.getOrDefault(id_list[i],0);
           }

           return answer;
    }
}