package SezimTasks;
/*Write a static method called checkCredentials() that takes two strings for username and password and checks if they are valid credentials.

The correct username is "superstar" (not case sensitive), and the correct password is "Hardpassword!" (case sensitive).

Params: Two strings for the username and password.

Return: A boolean value indicating whether or not the given username and password are valid.

Expected Output:

checkCredentials("Superstar", "Hardpassword!"); //  true
checkCredentials("superstar", "hardpassword!"); //  false
checkCredentials("johnsmith", "password123"); //false*/
public class LoginCreadentials {
    public static void main(String[] args) {
        System.out.println(checkCredentials("Superstar", "Hardpassword!"));
        System.out.println(checkCredentials("superstar", "hardpassword!"));
        System.out.println(checkCredentials("johnsmith", "password123"));

    }

    public static boolean checkCredentials(String username, String password){
/*
Метод equalsIgnoreCase() сравнивает две строки без учета регистра символов и возвращает true,
если строки идентичны (с точностью до символов, но без учета регистра),
и false в противном случае.*/


        if(username.equalsIgnoreCase("Superstar") && password.equals("Hardpassword!")){
            return true;
        }
        else{
            return false;
        }

    }
}
