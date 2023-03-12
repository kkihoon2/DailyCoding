import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution k  = new Solution();
        int[] output = k.mergeSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]
    }
}
class Solution {
    public int[] mergeSort(int[] arr) {
        sort(arr);
        return arr;
    }

    public int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        // leftIdx : 좌측 배열의 시작 인덱스
        int leftIdx = left;
        // rightIdx : 우측 배열의 시작 인덱스
        int rightIdx = mid + 1;
        // index: 정렬된 값을 병합된 배열에 넣을 인덱스
        int index = left;

        // 좌측 배열, 우측 배열 두 배열중 한쪽의 요소가 모두 없어질 때까지 반복합니다.
        while(leftIdx <= mid && rightIdx <= right) {
            if(temp[leftIdx] <= temp[rightIdx]) {
                arr[index++] = temp[leftIdx++];
            } else {
                arr[index++] = temp[rightIdx++];
            }
        }
        for(int i=0; i<=mid-leftIdx; i++) {
            arr[index+i] = temp[leftIdx+i];
        }
    }
}

