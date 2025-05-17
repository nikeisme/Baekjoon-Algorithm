import java.util.*;

class Solution {
    
    // 담을 arrayList 
    List<String> list = new ArrayList<>();
    
    // 알파벳 모음
    char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
      
        // 모든 알파벳 조합하는 함수
        dfs("");
        
        // 해당 단어의 위치 반환
        return list.indexOf(word)+1;
    }
    
    private void dfs(String current){
        
        // word 의 길이는 5이하
        if (current.length() > 5) return ;
        
        if (!current.isEmpty()) list.add(current);
        
        for (char c : vowels) {
            dfs(current+c);        
        }
    }
    
    
}