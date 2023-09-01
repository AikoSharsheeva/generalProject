package generalProject;

public class WhileStringBuilder15 {
    public static void main(String[] args) {
        System.out.println(printStringWithX("Excellent mood"));
    }

    public static String printStringWithX(String input) {

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (c == 'x' || c == 'X') {
                result.append(c).append(c);
            } else {
                result.append(c);
            }
            i++;
        }
        return result.toString();


    }
}
