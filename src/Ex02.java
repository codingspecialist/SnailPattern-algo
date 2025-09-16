public class Ex02 {
    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        int[][] arr;

        n = 3;
        num = 0;
        arr = new int[n][n];
        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[1][2] = ++num;
        arr[2][2] = ++num;
        arr[2][1] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
