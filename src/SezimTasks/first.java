package SezimTasks;

public class first {
    public static void main(String[] args) {
        System.out.println(findJavaIndex("This is a Java program")); //10
        System.out.println(findJavaIndex("Java is a popular programming language")); //0
        System.out.println(findJavaIndex("This string does not contain the word")); //-1
    }
    public static int findJavaIndex(String intput){
        int indexOfJ = intput.indexOf("Java");
        return indexOfJ;
    }


}
