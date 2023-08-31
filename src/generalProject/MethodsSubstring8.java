package generalProject;

public class MethodsSubstring8 {
    public static void main(String[] args) {

        System.out.println(totalDigit("Super Star"));

        System.out.println(getMiddle("Hello, Welcome to my page!"));

        System.out.println(bishkekNum("0312551188"));
    }
    public static String totalDigit(String str){

        return (str.substring(2,4));


    }
    public static String getMiddle(String str1){
        return (str1.substring(7,14));// from 7 to 14
    }
    public static boolean bishkekNum(String phone){
        if(phone.startsWith("312") || phone.startsWith("0312")){
            return true;
        }else{
            return false;
        }
    }

}
