class Solution {
    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = checkContinuous(new_id);
        new_id = check_forth(new_id);
        new_id = check_forth2(new_id);

        if(new_id.isBlank()){
            new_id = "aaa";
        }

        if(new_id.length() < 3){
            char addChar = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3){
                new_id += addChar;
            }
        }

        if(new_id.length()>15){
                new_id = new_id.substring(0,15);
            }
        
        new_id = check_forth2(new_id);

    
        answer = new_id;
        return answer;
    }

     static public String checkContinuous(String new_id) {
        new_id.replace("..",".");
        while (new_id.contains("..")){
            new_id = new_id.replace("..",".");
        }
        return new_id;
    }

    public static String check_forth(String new_id) {
        while (!new_id.isEmpty() && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1); 
        }
        return new_id;
    }

    public static String check_forth2(String new_id) {
        while (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1); 
        }
        return new_id;
    }
}
