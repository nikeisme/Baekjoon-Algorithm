class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // sign 배열 하나씩 
         for (int i = 0; i < signs.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        
        return answer;
    }
}