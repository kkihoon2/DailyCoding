import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int output = k.largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = k.largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }
}
class Solution {
    public int largestProductOfThree(int[] arr) {
        // TODO:
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    list.add(arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return Collections.max(list);
    }
}
//쉽게 푼 레퍼런스
//public class Solution {
//    public int largestProductOfThree(int[] arr) {
//        //배열을 오름차순으로 정리합니다.
//        Arrays.sort(arr);
//        int arrLength = arr.length;
//        //가장 큰 양수 3가지를 곱한 값
//        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
//        //가장 작은 음수 2가지와, 가장 큰 양수를 곱한 값
//        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
//        return Math.max(candidate1, candidate2);
//    }
//}
//문제 똑바로 안읽고 멍청한 짓 한것
//class Solution {
//    public int largestProductOfThree(int[] arr) {
//        // TODO:
//        Boolean[] visited = new Boolean[arr.length];
//        int answer = 0;
//        int cnt = 0;
//        ArrayList<Integer> resultList = new ArrayList<>();
//        dfs(arr, arr[0], 0,resultList);
//        return Collections.max(resultList);
//
//    }
//
//    static void dfs(int[] arr, int result, int cnt,ArrayList<Integer> resultList) {
//        if (cnt == arr.length-1) {
//            resultList.add(result);
//        }else {
//            dfs(arr, result * arr[cnt + 1], cnt + 1,resultList);
//            dfs(arr, result * arr[cnt + 1] * -1, cnt + 1,resultList);
//        }
//    }
//}
