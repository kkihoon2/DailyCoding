import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int[] output = k.bubbleSort(new int[]{1, 2, 43, 100, 100, 21});
        for (int i : output) {
            System.out.print(i);
        }
    }
}

class Solution {
    public int[] bubbleSort(int[] arr) {
        // TODO:
        for (int j = 0; j < arr.length; j++) {

            int cnt = 0 ;
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = 0;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    cnt++;
                }
            }
            if(cnt == 0)
                return arr;
        }
        return arr;
    }
}
