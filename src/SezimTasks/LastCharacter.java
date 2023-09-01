package SezimTasks;

/*Description:
Your task is to write a static method called getLastCharacter()
that will take in a string as input, and then return the last character of the string using the charAt method in Java.
if the string is empty the method should return '?'; if the String has only 1 char then return that char.

Params:

A string: The input string.

Return:

A char: The last character of the input string.

Expected Output:

getLastCharacter("Superstar");//r
getLastCharacter("wedevx");//x
getLastCharacter("");//?
getLastCharacter("A");//A*/
public class LastCharacter {
    public static void main(String[] args) {
        System.out.println(getLastCharacter("Superstar"));
        System.out.println(getLastCharacter("wedevx"));
        System.out.println(getLastCharacter(""));
        System.out.println(getLastCharacter("A"));
}
    public static char getLastCharacter(String s){
        if(s.isEmpty()){
            return '?';
        } else{
            return s.charAt(s.length()-1);
        }

    }
}
