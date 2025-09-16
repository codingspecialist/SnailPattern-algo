import java.util.ArrayList;
import java.util.List;

public class Ex05 {

    record Dir(int a, int b) {

    }

    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        int x = 0;
        int y = 0;
        int[][] arr;

        // 0,1 -> 1,0 -> 0,-1 -> -1,0 -> 0, 1
        List<Dir> dirs = new ArrayList<>();
        dirs.add(new Dir(0, 1)); // 오른쪽
        dirs.add(new Dir(1, 0)); // 아래쪽
        dirs.add(new Dir(0, -1)); // 왼쪽
        dirs.add(new Dir(-1, 0)); // 위쪽

        n = 3;
        num = 1;
        arr = new int[n][n];
        Dir dir;
        int index = 0;
        int currentIndex = 0;

        // 예외 1 들어가는 자리
        arr[x][y] = 1;

        // [+2,+2,-2,-1,+1]
        // y 2증가 -----------------------------
        currentIndex = index % 4;
        index++;
        dir = dirs.get(currentIndex);
        x = x + dir.a; // 0
        y = y + dir.b; // 1
        arr[x][y] = ++num;

        x = x + dir.a; // 0
        y = y + dir.b; // 2
        arr[x][y] = ++num;

        // x 2증가 -----------------------------
        currentIndex = index % 4;
        index++;
        dir = dirs.get(currentIndex);
        x = x + dir.a; // 1
        y = y + dir.b; // 2
        arr[x][y] = ++num;

        x = x + dir.a; // 2
        y = y + dir.b; // 2
        arr[x][y] = ++num;

        // y 2감소 ------------------------------
        currentIndex = index % 4;
        index++;
        dir = dirs.get(currentIndex);
        x = x + dir.a; // 2
        y = y + dir.b; // 1
        arr[x][y] = ++num;

        x = x + dir.a; // 2
        y = y + dir.b; // 0
        arr[x][y] = ++num;

        // x 1감소
        currentIndex = index % 4;
        index++;
        dir = dirs.get(currentIndex);
        x = x + dir.a; // 1
        y = y + dir.b; // 0
        arr[x][y] = ++num;

        // y 1증가
        currentIndex = index % 4;
        index++;
        dir = dirs.get(currentIndex);
        x = x + dir.a; // 1
        y = y + dir.b; // 1
        arr[x][y] = ++num;


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
