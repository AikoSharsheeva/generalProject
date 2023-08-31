package generalProject;

public class MethodsStringBoolean7 {
    public static void main(String[] args) {
        login("nvuip", "12345");

        String str3="Superstar";
        int countOfLength=countString(str3);
        System.out.println("Длина строки составляет " + countOfLength);

        String input="Independent day";
        char findLastChar=getLastCharacter(input);
        System.out.println("Последний символ " + findLastChar);
    }
    public static boolean login (String username, String password){
        boolean check=false;
         if(username.isEmpty()){
            System.out.println("username is Empty");
        }else if(password.isEmpty()){
             System.out.println("password is Empty");

    }else if(username.equals("superstar") && password.equals("12345")){
             check= true;
        System.out.println("login in");
        }else{
            System.out.println("Invalid");
        }return check;
    }
    public static int countString(String str){
        int str1=str.length();
        return str1;
    }
    public static char getLastCharacter(String str){
        if(str.isEmpty()){
            return '?';
        }else{
            return str.charAt(str.length()-1);
        }
    }
}
