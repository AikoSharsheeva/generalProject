package generalProject;

public class While19Practice {
    public static void main(String[] args) {
        byChar("aiko");
        withchar("Youtube");
        String str6 = "Operation must stop till 14";
        int num3 = 1;
        while (num3 <= 20) {

            if (num3 == 14) {
                break;

            }
            num3 += 2;
            System.out.println(str6);
        }

    }

    public static void byChar(String str) {
        int num = 0;
        while (num <= str.length() - 1) {
            char c = str.charAt(num);
            System.out.println(c);
            num++;
        }

    }

    public static void withchar(String str1) {
        int num2 = 0;
        while (num2 < str1.length()) {
            char ca = str1.charAt(num2);
            num2++;
            System.out.printf("%c-", ca);
        }
    }
}
