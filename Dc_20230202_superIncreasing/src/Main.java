public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        boolean output = k.superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = k.superIncreasing(new int[]{-2247, 1093, 1064});
        System.out.println(output); // --> true
    }
}
class Solution {
    public boolean superIncreasing(int[] arr) {
        // TODO:수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.
        int tot = 0;
        for(int i = 0 ; i < arr.length ;i++)
        {
            if(i>0)
            {
                tot=tot+arr[i-1];
            }
            if(tot>=arr[i])
                return false;
        }
        return true;
    }
}
//public class Solution {
//    public boolean superIncreasing(int[] arr) {
//        if(arr.length == 0) return false;
//        int sum = arr[0];
//
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] <= sum) {
//                return false;
//            }
//            sum = sum + arr[i];
//        }
//        return true;
//    }
//}