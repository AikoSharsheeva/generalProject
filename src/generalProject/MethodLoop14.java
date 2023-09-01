package generalProject;

public class MethodLoop14 {
    public static void main(String[] args) {
        charByOne("Mars");

        printConcatStr(" java ", "is fun");
    }

    public static void charByOne(String str) {
        int num = 0;
        while(num<=str.length()-1) {
            System.out.println(str.charAt(num) );
            num++;
        }
    }
    public static void printConcatStr(String str1, String str2){
        str1=str1.concat(str2);
        int num1=0;
        while(num1<str1.length()){
            char c=str1.charAt(num1);
            System.out.printf("%c-",c);
            num1++;
        }
    }


}
