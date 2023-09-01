package SezimTasks;
/*Description: Your task is to write a static method called checkGmailDomain()
that takes a String parameter (an email address) and checks if it contains the domain "@gmail.com". The method should return a boolean value - true if the email address contains the domain "@gmail.com", false otherwise.


Expected Output:

checkGmailDomain("tcook@apple.com");//false
checkGmailDomain("askar@wedevx.co");//false
checkGmailDomain("adina@gmail.com");//true*/
public class Domain {
    public static void main(String[] args) {
        System.out.println(checkGmailDomain("tcook@apple.com"));
        System.out.println(checkGmailDomain("sezim@wedevx.co"));
        System.out.println(checkGmailDomain("example@gmail.com"));


    }

    public static boolean checkGmailDomain(String email){
        if(email.endsWith("@gmail.com")){
            return true;
        } return false;
    }
}
