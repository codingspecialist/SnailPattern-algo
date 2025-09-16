class Solution {
    public int[][] solution(int n) {
        // 초기화
        int[][] arr;
        int x = 0, y = 0;
        int num = 0;
        int index = 0;
        int[] dx = {0, 1, 0, -1}; // 행 이동 (아래로 이동할 때 +1)
        int[] dy = {1, 0, -1, 0}; // 열 이동 (오른쪽으로 이동할 때 +1)

        // 1. init
        arr = new int[n][n];
        arr[x][y] = ++num;

        // 2. steps 만들기
        int size = 2 * n - 1;
        int[] steps = new int[size];

        steps[0] = n - 1;
        for (int i = 1; i < steps.length; i = i + 2) {
            steps[i] = n - 1;
            if (i + 1 == steps.length) break;
            steps[i + 1] = steps[i];
            n--;
        }


        // 3. 반복
        for (int k = 0; k < steps.length; k++) {
            for (int i = 0; i < steps[k]; i++) {
                x = x + dx[index % 4]; // 0
                y = y + dy[index % 4]; // 1
                arr[x][y] = ++num;
            }
            index++;
        }

        int[][] answer = arr;
        return answer;
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
