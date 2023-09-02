package generalProject;

public class NestedDiamond14 {
    public static void main(String[] args) {
        //   @
        //  @@@
        // @@@@@
        //@@@@@@@
        // @@@@@
        //  @@@
        //   @
        printDiamond(7, '@');
    }
    public static void printDiamond(int n, char symbol) {
        if (n % 2 == 0 || n < 1 || n >= 50) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");
            return;
        }

        // Upper part of the diamond
        for (int i = 1; i <= n; i += 2) {
            int spaces = (n - i) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 2; i >= 1; i -= 2) {
            int spaces = (n - i) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


}
