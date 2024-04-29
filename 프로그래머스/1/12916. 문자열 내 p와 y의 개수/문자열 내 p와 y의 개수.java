class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCount = 0;
        int yCount = 0;
        
        String s2 = s.toLowerCase();
        
        for(int i = 0; i < s2.length(); i++){
            if(String.valueOf(s2.charAt(i)).equals("p")){
                pCount++;
            }
            
            if(String.valueOf(s2.charAt(i)).equals("y")){
                yCount++;
            }
        }
        
        answer = pCount == yCount ? true : false;

        return answer;
    }
}