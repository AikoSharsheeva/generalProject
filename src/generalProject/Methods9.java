package generalProject;

public class Methods9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" my ").append("friend");
        sb.reverse();
        System.out.println(sb);

        System.out.println(removeWhiteSpacearound("   Hello, World   " + "friend"));
    }

    public static String removeWhiteSpacearound(String str) {

        return str.trim();
    }


}
