import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = k.convertListToHashMap(arr);

        System.out.println(output); // -->
//        {
//            "make" = "Ford"
//            "model" = "Mustang",
//                    "year" = "1964"
//        }
    }
}
class Solution {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO: 2차원 배열(배열을 요소로 갖는 배열)을 입력받아 각 배열을 이용해 만든 HashMap을 리턴해야 합니다.
        HashMap<String,String> answer = new HashMap<>();

        if(arr.length==0)
            return answer;

        for(int i =0;i< arr.length;i++)
        {
            if(!answer.containsKey(arr[i][0]))
                answer.put(arr[i][0],arr[i][1]);
        }
        return answer;
    }
}