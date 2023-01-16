public class Main {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1); // true
        boolean output2 = powerOfTwo(22);
        System.out.println(output2); // false
    }
    public static boolean powerOfTwo(long num) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다. 반복문(while)문을 사용해야 합니다.

        while(true)
        {
            if(num/2<=0)
                break;

            if(num%2==1)
                return false;

            num = num/2;
        }
        return true;


    }
}