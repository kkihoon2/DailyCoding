public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int output = k.fibonacci(0);
        System.out.println(output); // --> 0

        output = k.fibonacci(1);
        System.out.println(output); // --> 1

        output = k.fibonacci(5);
        System.out.println(output); // --> 5

        output = k.fibonacci(9);
        System.out.println(output); // --> 34
    }
}class Solution {
    public int fibonacci(int num) {
        // 금지된 문자열은 주석까지 확인합니다.
//        // TODO:
//        if(num==0)
//            return 0;
//        else if(num==1)
//            return 1;
//        else
        return fib(num);
    }
    static int fib(int num){
        if(num==0)
            return 0;
        else if(num==1)
            return 1;
        else return fib(num-2)+fib(num-1);
    }
}
