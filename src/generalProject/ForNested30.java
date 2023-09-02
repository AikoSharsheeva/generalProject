package generalProject;

public class ForNested30 {
    public static void main(String[] args) {
        printMultipleX(5,4);
    }
    public static void printMultipleX(int n, int m) {//n= строка    m=ряд
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("X");
            }
            System.out.print(" ");
        }
    }
}
