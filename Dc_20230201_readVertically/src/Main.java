public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String[] input = new String[]{
                "hello",
                "world"
        };
        String output = k.readVertically(input);
        System.out.println(output); // --> "hweolllrod"
    }
}

class Solution {
    public String readVertically(String[] arr) {
        // TODO:
        int maxLen = 0;
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLen) {
                maxLen = arr[i].length();
            }
        }
        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length()) {
                    answer = answer + arr[j].charAt(i);
                }
            }
        }
        return answer;
    }
}
