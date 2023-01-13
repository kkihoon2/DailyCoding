public class Main {
    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output); // --> 8

    }
    public static int computeWhenDouble(double interestRate) {
        // TODO:
        double rate = 1;
        int cnt = 0;
        if(interestRate == 100)
            return 1;
        while(rate<=2)
        {
            rate = rate * (1.0+interestRate/100);
            cnt++;
        }
        return cnt;
    }
}