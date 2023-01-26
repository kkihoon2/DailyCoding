public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        boolean output = k.ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }
}
class Solution {
    public boolean ABCheck(String str) {
        // TODO:
        String str2 = str.toLowerCase();
        for(int i = 0 ; i <str2.length()-4 ;i++)
        {
            if(str2.charAt(i)=='a'&&str2.charAt(i+4)=='b')
                return true;
            else if(str2.charAt(i)=='b'&&str2.charAt(i+4)=='a')
                return true;
        }
        return false;
    }
}
