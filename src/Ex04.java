public class Ex04 {
    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        int x = 0;
        int y = 0;
        int[][] arr;


        n = 3;
        num = 0;
        arr = new int[n][n];

        // 예외 1 들어가는 자리
        x = x + 0; // 0
        y = y + 0; // 0
        arr[x][y] = ++num;

        // [+2,+2,-2,-1,+1]
        // y 2증가 -----------------------------
        x = x + 0; // 0
        y = y + 1; // 1
        arr[x][y] = ++num;

        x = x + 0; // 0
        y = y + 1; // 2
        arr[x][y] = ++num;

        // x 2증가 -----------------------------
        x = x + 1; // 1
        y = y + 0; // 2
        arr[x][y] = ++num;

        x = x + 1; // 2
        y = y + 0; // 2
        arr[x][y] = ++num;

        // y 2감소 ------------------------------ 
        x = x + 0; // 2
        y = y - 1; // 1
        arr[x][y] = ++num;

        x = x + 0; // 2
        y = y - 1; // 0
        arr[x][y] = ++num;

        // x 1감소
        x = x - 1; // 1
        y = y + 0; // 0
        arr[x][y] = ++num;

        // y 1증가
        x = x + 0; // 1
        y = y + 1; // 1
        arr[x][y] = ++num;


        // [+3,+3,-3,-2,+2,+1,-1]
        n = 4;
        num = 0;
        arr = new int[n][n];
        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[0][3] = ++num;
        arr[1][3] = ++num;
        arr[2][3] = ++num;
        arr[3][3] = ++num;
        arr[3][2] = ++num;
        arr[3][1] = ++num;
        arr[3][0] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;
        arr[1][2] = ++num;
        arr[2][2] = ++num;
        arr[2][1] = ++num;

        // [+4,+4,-4,-3,+3,+2,-2,-1,+1]
        n = 5;
        num = 0;
        arr = new int[n][n];
        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[0][3] = ++num;
        arr[0][4] = ++num;
        arr[1][4] = ++num;
        arr[2][4] = ++num;
        arr[3][4] = ++num;
        arr[4][4] = ++num;
        arr[4][3] = ++num;
        arr[4][2] = ++num;
        arr[4][1] = ++num;
        arr[4][0] = ++num;
        arr[3][0] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;
        arr[1][2] = ++num;
        arr[1][3] = ++num;
        arr[2][3] = ++num;
        arr[3][3] = ++num;
        arr[3][2] = ++num;
        arr[3][1] = ++num;
        arr[2][1] = ++num;
        arr[2][2] = ++num;

        // n=6
        // [+5,+5,-5,-4,+4,+3,-3,-2,+2,+1,-1]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
