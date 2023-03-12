import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int[] output = k.heapSort(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3, 4, 5]

        output = k.heapSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]

        output = k.heapSort(new int[]{4, 10, 3, 5, 1});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 4, 5, 10]
    }
}class Solution {
    public int[] heapSort(int[] arr) {
        // 힙 정렬에 사용될 힙(우선순위 큐)을 선언합니다.
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        // 배열의 값을 힙에 모두 할당합니다.
        for(int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        // 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 배열에 넣어줍니다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}