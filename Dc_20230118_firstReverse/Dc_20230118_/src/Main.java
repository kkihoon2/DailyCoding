public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String output = k.firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = k.firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc evol I"
    }
}
class Solution {
    public String firstReverse(String str) {
        // TODO:
        StringBuffer sb = new StringBuffer(str);
        String answer = sb.reverse().toString();
        return answer;

    }
}
