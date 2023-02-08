public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String output = k.decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = k.decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }
}
class Solution {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String answer ="";
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)==' ')
            {
                answer = answer+' ';
                continue;
            }
            if(str.charAt(i)-secret>122){
                answer = answer + (char)(str.charAt(i)-secret-26);
                continue;
            }else if(str.charAt(i)-secret<97){
                answer = answer + (char)(str.charAt(i)-secret+26);
                continue;
            }
            answer = answer + (char)(str.charAt(i)-secret);
        }
        return answer;
    }
}