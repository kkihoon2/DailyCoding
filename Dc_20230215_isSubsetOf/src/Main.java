import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = k.isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = k.isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = k.isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
}

class Solution {
    public boolean isSubsetOf(int[] base, int[] sample) {
        // TODO: 두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.
        if (base.length > 50000 || sample.length > 50000)
            return false;
        List<Integer> list
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < sample.length; i++) {
            if (!list.contains(sample[i]))
                return false;
        }
        return true;
    }
}