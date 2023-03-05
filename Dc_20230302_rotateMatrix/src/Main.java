import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 0;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = k.rotateMatrix(matrix, K);
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
    }
}

class Solution {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        if(matrix==null){
            return null;
        }
        int cnt = 0;
        K = K%4;
        if(K==0)
            return matrix;
        Stack<Integer> stack = new Stack<>();
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        while (cnt <K) {
            for (int i = matrix[0].length - 1; i >= 0; i--) {
                for (int j = 0; j < matrix.length; j++) {
                    stack.push(matrix[j][i]);
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    newMatrix[i][j] = stack.pop();
                }
            }
            cnt++;
            matrix = newMatrix;
        }

        return newMatrix;

    }
}
/*
class Solution {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        int[][] newMatrix=new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                newMatrix[(j+ matrix.length-1)% (matrix.length)][i]=matrix[i][j];
            }
        }
    }
}*/
