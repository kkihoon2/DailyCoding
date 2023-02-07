public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int output = k.numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = k.numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = k.numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
}class Solution {
    public int numberSearch(String str) {
        // TODO:
        int cnt=0;
        if(str.length()==0)
            return 0;

        for(int i =0 ; i<str.length();i++){
            for(int j = 0 ; j<10;j++){
                if(str.charAt(i)==Character.forDigit(j,10)){
                    cnt = cnt+j;
                }
            }
        }
        str = str.replaceAll(" ","");
        str = str.replaceAll("[0-9]","");
        System.out.println(str);
        double answer = (double)cnt/(double)str.length();
        System.out.println(answer);
        String result1 = String.format("%.0f",answer);

        return Integer.parseInt(result1);
    }
}