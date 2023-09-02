package generalProject;

public class NestedForLoop28drawing {
    public static void main(String[] args) {
        //*   *
        // * *
        //  *
        // * *
        //*   *
        printX(5);
    }
    public static void printX(int n) {
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n; x++) {
                if (i == x || x == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
