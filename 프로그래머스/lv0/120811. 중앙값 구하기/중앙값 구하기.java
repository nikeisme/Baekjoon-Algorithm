import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int i =0;
        
        Arrays.sort(array);
        
        i = array.length/2;
        //System.out.print(i);
        
        return array[i];
    }
}