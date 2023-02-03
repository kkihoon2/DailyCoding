public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        Integer output = k.modulo(25, 4);
        System.out.println(output); // --> 1

        output = k.modulo(25, 0);
        System.out.println(output); // --> null
    }
}
class Solution {
    public Integer modulo(int num1, int num2) {
        if(num2 == 0) {
            return null;
        }

        while (num1 >= num2) {
            num1 = num1 - num2;
        }

        return num1;
    }
}
//class Solution {
//    public Integer modulo(int num1, int num2) {
//
//        if(num2==0)
//            return null;
//        else
//            return recursive(num1,num2);
//    }
//    public static int recursive(int num1,int num2){
//        if(num1<num2&&num1>=0){
//            return num1;
//        }else recursive(num1-num2,num2);
//
//        return -1;
//    }
//}