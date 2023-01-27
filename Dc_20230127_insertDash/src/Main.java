public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String output = k.insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }
}
class Solution {
    public String insertDash(String str) {
        // TODO:문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴해야 합니다.
        String answer = "";
        if(str.length()==0)
            return null;

        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i)%2==1&&str.charAt(i-1)%2==1)
            {
                answer = answer + "-";
            }
            answer += str.charAt(i);
        }
        return answer;
    }
}