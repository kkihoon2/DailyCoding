import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int[] arr = new int[]{1,2,3};
        int[] output = k.reverseArr(arr);
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
}
class Solution {
    public int[] reverseArr(int[] arr){
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }
}











//        if(arr.length==0)
//            return new int[]{};
//        ArrayList<Integer>list = new ArrayList<>();
//        for (int i : arr) {
//            list.add(i);
//        }
//        Collections.reverse(list);
//        int[] answer = new int[arr.length];
//        for (int i =0 ;i<arr.length;i++){
//            answer[i]=list.get(i);
//        }
//        return answer;

