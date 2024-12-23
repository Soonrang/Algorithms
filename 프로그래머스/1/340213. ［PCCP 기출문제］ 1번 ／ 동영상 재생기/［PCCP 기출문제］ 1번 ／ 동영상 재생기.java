class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int minute = Integer.parseInt(pos.substring(0, 2));
        int second = Integer.parseInt(pos.substring(3, 5));
        int[] posTime = {minute, second};

        int[] videoTime = {Integer.parseInt(video_len.substring(0, 2)), Integer.parseInt(video_len.substring(3, 5))};
        int[] opStartTime = {Integer.parseInt(op_start.substring(0, 2)), Integer.parseInt(op_start.substring(3, 5))};
        int[] opEndTime = {Integer.parseInt(op_end.substring(0, 2)), Integer.parseInt(op_end.substring(3, 5))};

        String afCheck = checkOp(opStartTime, opEndTime, posTime);
        posTime[0] = Integer.parseInt(afCheck.substring(0, 2));
        posTime[1] = Integer.parseInt(afCheck.substring(3, 5));

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                posTime[1] += 10;
            } else if (commands[i].equals("prev")) {
                posTime[1] -= 10;
            }

            // 0초~59초 조정
            if (posTime[1] < 0) {
                posTime[0] -= 1;
                posTime[1] += 60;
            } else if (posTime[1] > 59) {
                posTime[0] += 1;
                posTime[1] -= 60;
            }

            // 비디오 길이 체크
            int currentSecond = posTime[0] * 60 + posTime[1];
            int videoSecond = videoTime[0] * 60 + videoTime[1];

            if (currentSecond > videoSecond) {
                posTime[0] = videoTime[0];
                posTime[1] = videoTime[1];
            } else if (currentSecond < 0) {
                posTime[0] = 0;
                posTime[1] = 0;
            }

            afCheck = checkOp(opStartTime, opEndTime, posTime);
            posTime[0] = Integer.parseInt(afCheck.substring(0, 2));
            posTime[1] = Integer.parseInt(afCheck.substring(3, 5));

            System.out.println(i + "번째 시간: " + String.format("%02d:%02d", posTime[0], posTime[1]));
        }

        return String.format("%02d:%02d", posTime[0], posTime[1]);
    }

    private static String checkOp(int[] opStartTime, int[] opEndTime, int[] posTime) {
        int startOpSecond = opStartTime[0] * 60 + opStartTime[1];
        int endOpSecond = opEndTime[0] * 60 + opEndTime[1];
        int afterVideoLen = posTime[0] * 60 + posTime[1];

        if (afterVideoLen >= startOpSecond && afterVideoLen <= endOpSecond) {
            posTime[0] = opEndTime[0];
            posTime[1] = opEndTime[1];
        }

        return String.format("%02d:%02d", posTime[0], posTime[1]);
    }
}
