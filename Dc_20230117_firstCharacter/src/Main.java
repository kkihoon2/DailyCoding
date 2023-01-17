public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String output = k.firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        output = k.firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output); // --> "TcaCSmbtba"
    }
}
class Solution {
    public String firstCharacter(String str) {
        // TODO:문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴해야 합니다.
        if(str.isEmpty())
            return "";
        String[] answer = str.split(" ");
        String result = "";
        for(String k : answer)
        {
            result = result+k.charAt(0);
        }
        return result;
    }
}