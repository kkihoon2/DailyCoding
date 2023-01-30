import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        String[] output = k.removeExtremes(new String[]{"a", "b", "c", "def"});
        for(int i  = 0; i < output.length;i++) {
            System.out.print(output[i]); // --> ["a"', "b"]
        }
        System.out.println();
        output = k.removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        for(int i  = 0; i < output.length;i++) {
            System.out.print(output[i]); // --> ["a"', "b"]
        }
    }
}
class Solution {
    public String[] removeExtremes(String[] arr) {
        // TODO:
        int max=0;
        int min=0;
        if(arr.length==0)
            return null;

        ArrayList<String> list= new ArrayList();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].length()>=arr[max].length())
            {
                max = i ;
            }
            if(arr[i].length()<=arr[min].length())
            {
                min = i ;
            }
            list.add(arr[i]);
        }
        list.remove(String.valueOf(arr[min]));
        list.remove(String.valueOf(arr[max]));
        String[] answer = list.toArray(new String[list.size()]);
        return answer;

    }
}
