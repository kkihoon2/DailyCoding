public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        boolean output = k.isIsogram("aba");
        System.out.println(output); // false

        output = k.isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = k.isIsogram("moOse");
        System.out.println(output); // false
    }
}
class Solution {
    public boolean isIsogram(String str) {
        // TODO:
        str=str.toLowerCase();
        for(int i =0;i< str.length();i++){
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}