package SezimTasks;
/*Description:
Your task is to write a static method called getMiddleChars()
that takes in a string as input and returns the middle character(s) of the string.
If the string has an odd number of characters,
the method should return the single middle character.
If the string has an even number of characters, the method should return the two middle characters.
if the string is empty method should return "???".
if the string is only one or two character return those characters.

Params:

A string: The input string for which you want to find the middle character(s).

Return:

A string: The middle character(s) of the input string.

Expected Output:

getMiddleChars("wedevx")//de
getMiddleChars("hello")//l
getMiddleChars("stackoverflow")//v
getMiddleChars("java")//av
getMiddleChars("ja")//ja
getMiddleChars("b")//b
getMiddleChars("")//???*/
public class MiddleCharacter {
    public static void main(String[] args) {
        getMiddleChars("wedevx");//de
        getMiddleChars("hello");//l
        getMiddleChars("stackoverflow");//v
        getMiddleChars("java");//av
        getMiddleChars("ja");//ja
        getMiddleChars("b");//b
        getMiddleChars("");//???*/

    }

    public static void getMiddleChars(String s){
        if (s.isEmpty()){
            System.out.println("???");
        } else{
            if(s.length() <= 2){
                System.out.println(s);
            } else {
                if((s.length()-1) % 2 == 0){
                    System.out.println(s.charAt(s.length()/2));
                }else {
                    System.out.println(s.substring((s.length()/2)-1, (s.length()/2) + 1));
                }

            }


        }

    }
}
