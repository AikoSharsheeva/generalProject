package SezimTasks;

public class NumberofCharacters {
    public static int countCharacter(String str) {
        int str1=str.length();
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(countCharacter("hello"));
        System.out.println(countCharacter(""));
        System.out.println(countCharacter("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce finibus erat enim, ut ultrices mauris fringilla ut."));
    }
}
