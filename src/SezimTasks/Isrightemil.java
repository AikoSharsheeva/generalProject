package SezimTasks;


/*Description: Your task is to write a static method called checkEmailDomain() that will take in an input String (the email address) and determine if it contains the domain "devxschool.com" or "wedevx.co" or "wedevx.com". The method should return a boolean value indicating whether or not the domain is present in the email address.

Params: A String representing the email address to be checked.

Return: A boolean value indicating whether or not the email address contains the domain "devxschool.com" or "wedevx.co" or "wedevx.com".

Expected Output:

checkEmailDomain("alexa@amazon.com");//false
checkEmailDomain("siri@apple.com");//false
checkEmailDomain("google@gmail.com");//false
checkEmailDomain("askar@devxschool.com"); //true
checkEmailDomain("adina@wedevx.co");//true
checkEmailDomain("sean@wedevx.com");//true*/
public class Isrightemil {
    public static void main(String[] args) {
        System.out.println(checkEmailDomain("alexa@amazon.com"));
        System.out.println(checkEmailDomain("siri@apple.com"));
        System.out.println(checkEmailDomain("google@gmail.com"));
        System.out.println(checkEmailDomain("askar@devxschool.com"));
        System.out.println(checkEmailDomain("adina@wedevx.co"));
        System.out.println(checkEmailDomain("sean@wedevx.com"));

    }

    public static boolean checkEmailDomain(String email){
        if(email.endsWith("@devxschool.com") || email.endsWith("@wedevx.co") || email.endsWith("@wedevx.com")){
            return true;
        }return false;

    }
}
