public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int output = k.tiling(2);
        System.out.println(output); // --> 2

        output = k.tiling(4);
        System.out.println(output); // --> 5
    }
}

class Solution {
    public int tiling(int num) {
        if(num==1)
            return 1;
        int[] result = new int[num + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        if (num > 2) {
            for (int i = 3; i < result.length ; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result[num];
    }
}
