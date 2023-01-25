public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String output = k.convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }
}
class Solution {
    public String convertDoubleSpaceToSingle(String str) {
        // TODO:
        String result = str.replaceAll("  "," ");
        return result;
    }
}
