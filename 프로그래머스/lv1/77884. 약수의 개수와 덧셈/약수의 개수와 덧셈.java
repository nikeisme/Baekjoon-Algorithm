class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int n = left; n <=right; n++) {
            if (n % Math.sqrt(n) == 0 ) { // n이 제곱 수 일 경우, 약수의 개수는 홀수
                answer -= n;
            } else { // n이 제곱 수가 아닐 경우 약수의 개수는 짝수 
                answer += n;
            }
        }
        
        return answer;
    }
}