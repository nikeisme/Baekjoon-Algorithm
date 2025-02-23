class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        
        // 0~9 까지 합은 45
        for (int i : numbers){
            sum -= i;
        }
        
        return sum;
    }
}