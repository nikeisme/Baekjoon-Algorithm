import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
    	//깊은 복사 방법 사용
		int[] copyArr = emergency.clone();
		Arrays.sort(copyArr);
        
        //정렬순서대로 응급도 역순 부여 + Map에 저장
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
			int rank = copyArr.length;
			for (int i=0; i<copyArr.length; i++) {
				put(copyArr[i], rank);
				rank--;
			}
		}};

		//배열 값을 응급도로 바꾼 뒤 배열 리턴
		for (int i=0; i<emergency.length; i++) {
			emergency[i] = map.get(Integer.valueOf(emergency[i]));
		}
        return emergency;
    }
}