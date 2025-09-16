import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[][] solution(int n) {
        // 1. 초기화
        int x = 0;
        int y = 0;
        int[] dx = {0, 1, 0, -1}; // 행 이동 (아래로 이동할 때 +1)
        int[] dy = {1, 0, -1, 0}; // 열 이동 (오른쪽으로 이동할 때 +1)

        // 2. N=5일때, 달팽이
        int num = 1;
        int[][] arr = new int[n][n];

        int index = 0;
        int currentIndex = 0;

        List<Integer> newSteps = new ArrayList<>();
        int newN = n - 1; // 2
        newSteps.add(newN); // 2
        newSteps.add(newN); // 2
        newSteps.add(newN); // 2
        newN--; // 1

        while (newN > 0) {
            newSteps.add(newN);
            newSteps.add(newN);
            newN--;
        }

        // 2.1 예외 코드
        arr[x][y] = 1;

        // 2.2 공통 모듈
        for (int k = 0; k < newSteps.size(); k++) {
            currentIndex = index % 4;
            index++;
            for (int i = 0; i < newSteps.get(k); i++) {
                x = x + dx[currentIndex]; // 0
                y = y + dy[currentIndex]; // 1
                arr[x][y] = ++num;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = solution.solution(4);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
