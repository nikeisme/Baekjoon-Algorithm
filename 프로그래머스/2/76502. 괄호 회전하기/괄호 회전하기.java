import java.util.*;

class Solution {

    // 조합을 담을 배열
    List<String> list = new ArrayList<>();

    String[] correct = {"(), [], {}"};
    
    public int solution(String s) {
        int answer = -1;
        
        // 모든 조합해보는 함수
        dfs(s);
        return answer;
    }
    
    private void dfs(String current){
        
        // 길이가 1000 이상이면 반환
        if (current.length() > 1000) return;
        
        // 배열에 문자열 담기 
        if(!current.isEmpty()) list.add(current);
        
        System.out.println(list.toString());
        

    }
}