import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int output = k.rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        int output1 = k.rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output1); // --> -1
    }
}
class Solution {
    public int rotatedArraySearch(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while(left <= right) {
            int middle = (right + left) / 2;

            if(rotated[middle] == target) {
                return middle;
            }

            if (rotated[left] < rotated[middle]) {
                if (target < rotated[middle] && rotated[left] <= target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target <= rotated[right] && rotated[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }
}
//class Solution {
//    public int rotatedArraySearch(int[] rotated, int target) {
//        // TODO:
//        int tempLength = rotated.length;
//        int[] copyArr = new int[tempLength];
//        System.arraycopy(rotated,0,copyArr,0,rotated.length-1);
//        while(true)
//        {
//
//            if(copyArr[tempLength/2]==target){
//                return tempLength/2;
//            }
//            if(tempLength==1)
//                return -1;
//            if(copyArr[tempLength/2]>target)
//            {
//                copyArr = new int[tempLength];
//                copyArr = Arrays.copyOfRange(copyArr,0,tempLength/2);
//                tempLength = tempLength/2;
//            }else{
//                copyArr = new int[tempLength];
//                copyArr = Arrays.copyOfRange(copyArr,tempLength/2+1,tempLength);
//                tempLength = tempLength/2;
//            }
//        }
//
//    }
//}