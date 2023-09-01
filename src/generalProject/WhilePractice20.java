package generalProject;

public class WhilePractice20 {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));// факториал 5 это 1*2*3*4*5=120
    }

    public static int calculateFactorial(int input) {
        switch (input) {
            case 0:
                return 1;
            case -1:
                return -1;
            default:
                if (input < 0) {
                    return -1;
                } else {
                    int factorial = 1;
                    int i = input;

                    while (i > 0) {
                        factorial *= i;
                        i--;
                    }

                    return factorial;
                }
        }
    }
}

